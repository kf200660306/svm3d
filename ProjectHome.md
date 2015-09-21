<table><tr><td>
Svm3d let you draw a 3d surface out of a Support Vector Machine regression model. There's an immediate mouse control, and it's very easy to enhance the chart to add many other informations (input points, errors, support vectors, tooltips, etc).<br>
<br>
We seek compliancy with the well known <a href='http://www.csie.ntu.edu.tw/~cjlin/libsvm/'>libsvm</a>. It is wrapped in InstantSVM, a really thin wrapper for facilitating its use. Libsvm 2.91 is bundled in the project with little changes to the API to retrieve private content from an SVM models, and allow to display/edit internal context (kernel, support vector, etc).<br>
Later, InstantSVM will help maintaining a clean dataset and model library.<br>
<br>
3d rendering is powered by <a href='http://code.google.com/p/jzy3d'>Jzy3d</a>, a java library that creates charts for either AWT, Swing or Eclipse RCP platforms. It relies on binaries which are provided for windows 32, osx 64, and osx i386.<br>
<br>
It's more a proof of concept than a stable project but it's a good place to start drawing SVM models in 3D. Check the following demos in package org.instantsvm.demos.svm3d:<br>
<ul><li>ConeRegressionDemo<br>
</li><li>RingsRegressionDemo</li></ul>

You can either download a ready to run Eclipse project from the "Downloads" tab, or check out the SVN trunk from the tab "Source".<br>
<br>
You can contact the project maintainer at martin.pernollet at gmail dot com<br>
<br>
</td><td>
<img src='http://martin.pernollet.free.fr/cv/projects/svm3d/svm3d.jpg' />
</td></tr></table>