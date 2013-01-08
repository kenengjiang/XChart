/**
 * Copyright 2011-2012 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xchart.example;

import java.util.Arrays;
import java.util.Collection;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.Series;
import com.xeiam.xchart.SeriesMarker;
import com.xeiam.xchart.SwingWrapper;

/**
 * Embed a Chart in a simple Swing application
 * 
 * @author timmolter
 */
public class Example11 {

  public static void main(String[] args) {

    // data
    Number[] xDataArray = new Number[] { 0.0, 2.0E-6, 4.0E-6, 6.0E-6, 8.0E-6, 9.999999999999999E-6, 1.1999999999999999E-5, 1.3999999999999998E-5, 1.6E-5, 1.8E-5, 2.0E-5, 2.2000000000000003E-5,
        2.4000000000000004E-5, 2.6000000000000005E-5, 2.8000000000000006E-5, 3.0000000000000008E-5, 3.2000000000000005E-5, 3.4000000000000007E-5, 3.600000000000001E-5, 3.800000000000001E-5,
        4.000000000000001E-5, 4.200000000000001E-5, 4.400000000000001E-5, 4.6000000000000014E-5, 4.8000000000000015E-5, 5.0000000000000016E-5, 5.200000000000002E-5, 5.400000000000002E-5,
        5.600000000000002E-5, 5.800000000000002E-5, 6.000000000000002E-5, 6.200000000000002E-5, 6.400000000000001E-5, 6.6E-5, 6.8E-5, 7.0E-5, 7.199999999999999E-5, 7.399999999999998E-5,
        7.599999999999998E-5, 7.799999999999997E-5, 7.999999999999997E-5, 8.199999999999996E-5, 8.399999999999995E-5, 8.599999999999995E-5, 8.799999999999994E-5, 8.999999999999994E-5,
        9.199999999999993E-5, 9.399999999999993E-5, 9.599999999999992E-5, 9.799999999999992E-5, 9.999999999999991E-5, 1.019999999999999E-4, 1.039999999999999E-4, 1.0599999999999989E-4,
        1.0799999999999989E-4, 1.0999999999999988E-4, 1.1199999999999988E-4, 1.1399999999999987E-4, 1.1599999999999987E-4, 1.1799999999999986E-4, 1.1999999999999985E-4, 1.2199999999999985E-4,
        1.2399999999999984E-4, 1.2599999999999984E-4, 1.2799999999999983E-4, 1.2999999999999983E-4, 1.3199999999999982E-4, 1.3399999999999981E-4, 1.359999999999998E-4, 1.379999999999998E-4,
        1.399999999999998E-4, 1.419999999999998E-4, 1.439999999999998E-4, 1.4599999999999978E-4, 1.4799999999999978E-4, 1.4999999999999977E-4, 1.5199999999999976E-4, 1.5399999999999976E-4,
        1.5599999999999975E-4, 1.5799999999999975E-4, 1.5999999999999974E-4, 1.6199999999999974E-4, 1.6399999999999973E-4, 1.6599999999999973E-4, 1.6799999999999972E-4, 1.6999999999999971E-4,
        1.719999999999997E-4, 1.739999999999997E-4, 1.759999999999997E-4, 1.779999999999997E-4, 1.7999999999999969E-4, 1.8199999999999968E-4, 1.8399999999999967E-4, 1.8599999999999967E-4,
        1.8799999999999966E-4, 1.8999999999999966E-4, 1.9199999999999965E-4, 1.9399999999999965E-4, 1.9599999999999964E-4, 1.9799999999999964E-4, 1.9999999999999963E-4, 2.0199999999999962E-4,
        2.0399999999999962E-4, 2.059999999999996E-4, 2.079999999999996E-4, 2.099999999999996E-4, 2.119999999999996E-4, 2.139999999999996E-4, 2.1599999999999959E-4, 2.1799999999999958E-4,
        2.1999999999999957E-4, 2.2199999999999957E-4, 2.2399999999999956E-4, 2.2599999999999956E-4, 2.2799999999999955E-4, 2.2999999999999955E-4, 2.3199999999999954E-4, 2.3399999999999953E-4,
        2.3599999999999953E-4, 2.3799999999999952E-4, 2.3999999999999952E-4, 2.419999999999995E-4, 2.439999999999995E-4, 2.4599999999999953E-4, 2.479999999999995E-4, 2.499999999999995E-4,
        2.519999999999995E-4, 2.539999999999995E-4, 2.559999999999995E-4, 2.579999999999995E-4, 2.599999999999995E-4, 2.619999999999995E-4, 2.639999999999995E-4, 2.6599999999999947E-4,
        2.6799999999999947E-4, 2.6999999999999946E-4, 2.7199999999999946E-4, 2.7399999999999945E-4, 2.7599999999999944E-4, 2.7799999999999944E-4, 2.7999999999999943E-4, 2.8199999999999943E-4,
        2.839999999999994E-4, 2.859999999999994E-4, 2.879999999999994E-4, 2.899999999999994E-4, 2.919999999999994E-4, 2.939999999999994E-4, 2.959999999999994E-4, 2.979999999999994E-4,
        2.999999999999994E-4, 3.0199999999999937E-4, 3.0399999999999937E-4, 3.0599999999999936E-4, 3.0799999999999936E-4, 3.0999999999999935E-4, 3.1199999999999934E-4, 3.1399999999999934E-4,
        3.1599999999999933E-4, 3.179999999999993E-4, 3.199999999999993E-4, 3.219999999999993E-4, 3.239999999999993E-4, 3.259999999999993E-4, 3.279999999999993E-4, 3.299999999999993E-4,
        3.319999999999993E-4, 3.339999999999993E-4, 3.359999999999993E-4, 3.3799999999999927E-4, 3.3999999999999927E-4, 3.4199999999999926E-4, 3.4399999999999925E-4, 3.4599999999999925E-4,
        3.4799999999999924E-4, 3.4999999999999924E-4, 3.5199999999999923E-4, 3.539999999999992E-4, 3.559999999999992E-4, 3.579999999999992E-4, 3.599999999999992E-4, 3.619999999999992E-4,
        3.639999999999992E-4, 3.659999999999992E-4, 3.679999999999992E-4, 3.699999999999992E-4, 3.719999999999992E-4, 3.7399999999999917E-4, 3.7599999999999916E-4, 3.7799999999999916E-4,
        3.7999999999999915E-4, 3.8199999999999915E-4, 3.8399999999999914E-4, 3.8599999999999914E-4, 3.8799999999999913E-4, 3.899999999999991E-4, 3.919999999999991E-4, 3.939999999999991E-4,
        3.959999999999991E-4, 3.979999999999991E-4, 3.999999999999991E-4, 4.019999999999991E-4 };
    Collection<Number> xData = Arrays.asList(xDataArray);

    Number[] yDataArray = new Number[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6372101692308739,
        0.6333108573262538, 0.6295378262991362, 0.6259234359720381, 0.6226800066605563, 0.6195071339906413, 0.6166201487693563, 0.613787621947162, 0.6108988791636593, 0.6082244232360293,
        0.6056170503744838, 0.6031132424617048, 0.600721461522759, 0.5985311868828369, 0.5964073518335689, 0.5942410772230486, 0.5922453479977628, 0.5901765175165123, 0.5882822154061506,
        0.5864532990597335, 0.5846724904863335, 0.58297796864999, 0.5813406710959594, 0.5796660243243492, 0.5782002672376352, 0.5766565927458179, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6231997030387646, 0.621204395714257, 0.6191737313408935, 0.6171961639533186, 0.6152254530814898,
        0.6134505469540993, 0.6116785919218266, 0.6099093025992627, 0.6081388759571905, 0.6065055388348788, 0.6048612569349429, 0.6033243742714489, 0.6017010826285737, 0.6002252301825577,
        0.5986650199672785, 0.597230396889992, 0.5958314437746937, 0.5944185272326469, 0.593065510924995, 0.5917359663724286, 0.5904117737773237, 0.5891005037981919, 0.5878558348315347,
        0.5866748898114135, 0.5854834223130877, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6102542598144771,
        0.6088615058903939, 0.6075165945246479, 0.606173865264273, 0.6048892886319646, 0.6036269945746775, 0.6024031054359631, 0.6012060990636389, 0.5999707073752844, 0.5987445851044376,
        0.5976670759284103, 0.5964760539465047, 0.5953596186235112, 0.5942083942859213, 0.5931534018292057, 0.5920553037922442, 0.5909328610294284, 0.5899221607557993, 0.5888796149501155,
        0.5878477730026161, 0.5868619466225057, 0.5859043952287553, 0.5849217522473235, 0.5839384045103886, 0.582972125771751, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.597725222494134, 0.5967165514126065, 0.595690065134673, 0.5946455873652494, 0.5936749101268612, 0.5927272236764601,
        0.5917600038873098, 0.5907636148444239, 0.5897911064021713, 0.5888437521080321, 0.5879184432039671, 0.5869713714610235, 0.5861140207841755, 0.585241586718861, 0.5843729271284958,
        0.5834786347516403, 0.5826219070584836, 0.58179223726965, 0.5809457169899226, 0.5801700375138839, 0.5793487282645163, 0.5785614443246223, 0.5777884312743851, 0.5769659838524158,
        0.5762259275606331, 0.0 };
    Collection<Number> yData = Arrays.asList(yDataArray);

    // Create Chart
    Chart chart = new Chart(800, 600);

    // Customize Chart
    chart.setTitleVisible(false);
    chart.setLegendVisible(false);

    // Series 1
    Series series1 = chart.addSeries("data", xData, yData);
    series1.setMarker(SeriesMarker.NONE);

    new SwingWrapper(chart).displayChart();
  }
}