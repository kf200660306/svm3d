package org.instantsvm.svm3d.tesselation;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import libsvm.svm_node;
import net.masagroup.jzy3d.maths.Coord3d;
import net.masagroup.jzy3d.maths.Range;
import net.masagroup.jzy3d.plot3d.builder.Mapper;
import net.masagroup.jzy3d.plot3d.builder.concrete.OrthonormalGrid;

import org.instantsvm.svm3d.utils.Conversion;

public class SvmGrid extends OrthonormalGrid{
	public SvmGrid(Range xyrange, int xysteps){
		super(xyrange, xysteps);
	}
	
	public SvmGrid(Range xrange, int xsteps, Range yrange, int ysteps){
		super(xrange, xsteps, yrange, ysteps);
	}
	
	public List<Coord3d> apply(Mapper mapper) {
		if(mapper instanceof SvmMapper){
			SvmMapper svmm = (SvmMapper)mapper;
			
			Vector<svm_node[]> nodes = Conversion.toDataset(xrange, yrange, xsteps, ysteps);        
	        double[] out = svmm.f(nodes);
	        
	        List<Coord3d> output = new ArrayList<Coord3d>(xsteps*ysteps);
	        for(int i=0; i<out.length; i++)
	        	output.add( new Coord3d( nodes.get(i)[0].value, nodes.get(i)[1].value, out[i] ) );        
	        return output;
		}
		return null;
    }
}
