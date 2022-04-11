
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    aVLTree9.insert(0);
    AVLTree.Node node14 = aVLTree9.getRoot();
    AVLTree.Node node15 = aVLTree9.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    int i17 = aVLTree0.height();
    int i18 = aVLTree0.height();
    int i19 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete(100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    int i30 = aVLTree25.height();
    aVLTree25.delete((int)(byte)-1);
    AVLTree.Node node34 = aVLTree25.find((int)(short)0);
    int i35 = aVLTree0.getBalance(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)10);
    aVLTree0.insert((int)(short)10);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node23 = aVLTree0.find((int)'4');
    AVLTree.Node node25 = aVLTree0.find((int)(short)1);
    AVLTree.Node node26 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)100);
    aVLTree0.delete((int)'4');
    aVLTree0.delete(2);
    aVLTree0.insert((int)(byte)-1);
    int i17 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node3 = null;
    int i4 = aVLTree0.getBalance(node3);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node3 = aVLTree0.getRoot();
    AVLTree aVLTree4 = new AVLTree();
    AVLTree.Node node5 = null;
    int i6 = aVLTree4.getBalance(node5);
    AVLTree.Node node8 = aVLTree4.find((int)'4');
    aVLTree4.insert(0);
    aVLTree4.insert((int)(byte)10);
    AVLTree.Node node13 = aVLTree4.getRoot();
    aVLTree4.insert((int)(short)100);
    AVLTree.Node node17 = aVLTree4.find((int)'a');
    AVLTree.Node node18 = aVLTree4.getRoot();
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    AVLTree.Node node23 = aVLTree19.find((int)'4');
    aVLTree19.insert(0);
    AVLTree.Node node26 = aVLTree19.getRoot();
    AVLTree.Node node27 = aVLTree19.getRoot();
    aVLTree19.insert((int)(byte)1);
    AVLTree.Node node30 = aVLTree19.getRoot();
    int i31 = aVLTree4.getBalance(node30);
    int i32 = aVLTree0.getBalance(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find((int)(short)0);
    aVLTree0.delete((int)(short)-1);
    aVLTree0.insert(10);
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    AVLTree.Node node25 = aVLTree17.getRoot();
    int i26 = aVLTree17.height();
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    AVLTree.Node node37 = aVLTree30.getRoot();
    int i38 = aVLTree27.getBalance(node37);
    int i39 = aVLTree17.getBalance(node37);
    aVLTree17.delete((int)(short)10);
    aVLTree17.delete(100);
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    AVLTree.Node node48 = aVLTree44.find((int)'4');
    aVLTree44.insert(0);
    aVLTree44.insert((int)(byte)10);
    AVLTree.Node node53 = aVLTree44.getRoot();
    int i54 = aVLTree17.getBalance(node53);
    int i55 = aVLTree17.height();
    aVLTree17.delete((int)(short)1);
    AVLTree aVLTree58 = new AVLTree();
    AVLTree.Node node59 = null;
    int i60 = aVLTree58.getBalance(node59);
    AVLTree.Node node62 = aVLTree58.find((int)'4');
    aVLTree58.insert(0);
    AVLTree.Node node65 = aVLTree58.getRoot();
    AVLTree.Node node66 = aVLTree58.getRoot();
    int i67 = aVLTree17.getBalance(node66);
    AVLTree.Node node68 = aVLTree17.getRoot();
    int i69 = aVLTree0.getBalance(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    aVLTree31.insert((int)(short)1);
    AVLTree.Node node43 = aVLTree31.getRoot();
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    aVLTree44.insert(0);
    AVLTree.Node node49 = aVLTree44.getRoot();
    int i50 = aVLTree31.getBalance(node49);
    aVLTree31.insert(10);
    AVLTree.Node node53 = aVLTree31.getRoot();
    int i54 = aVLTree0.getBalance(node53);
    aVLTree0.delete((int)'a');
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node60 = aVLTree0.find((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    int i27 = aVLTree0.height();
    AVLTree aVLTree28 = new AVLTree();
    aVLTree28.insert(0);
    AVLTree.Node node32 = aVLTree28.find(100);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    aVLTree33.insert(0);
    int i38 = aVLTree33.height();
    aVLTree33.delete((int)(byte)-1);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    int i49 = aVLTree33.getBalance(node48);
    int i50 = aVLTree28.getBalance(node48);
    aVLTree28.insert((int)(short)-1);
    aVLTree28.delete((int)'4');
    aVLTree28.delete((int)' ');
    AVLTree.Node node58 = aVLTree28.find((int)(byte)0);
    int i59 = aVLTree0.getBalance(node58);
    AVLTree.Node node60 = aVLTree0.getRoot();
    AVLTree aVLTree61 = new AVLTree();
    AVLTree.Node node62 = null;
    int i63 = aVLTree61.getBalance(node62);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree.Node node68 = aVLTree64.find((int)'4');
    aVLTree64.insert(0);
    AVLTree.Node node71 = aVLTree64.getRoot();
    int i72 = aVLTree61.getBalance(node71);
    AVLTree aVLTree73 = new AVLTree();
    AVLTree.Node node74 = null;
    int i75 = aVLTree73.getBalance(node74);
    AVLTree.Node node77 = aVLTree73.find((int)'4');
    aVLTree73.insert(0);
    AVLTree.Node node80 = aVLTree73.getRoot();
    AVLTree.Node node81 = aVLTree73.getRoot();
    int i82 = aVLTree61.getBalance(node81);
    aVLTree61.insert(1);
    AVLTree.Node node86 = aVLTree61.find((int)'#');
    AVLTree.Node node88 = aVLTree61.find((int)(short)1);
    int i89 = aVLTree0.getBalance(node88);
    int i90 = aVLTree0.height();
    AVLTree.Node node91 = aVLTree0.getRoot();
    aVLTree0.delete((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node91);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node50 = aVLTree0.find(100);
    int i51 = aVLTree0.height();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    int i11 = aVLTree0.height();
    int i12 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)(short)10);
    AVLTree.Node node35 = aVLTree0.getRoot();
    AVLTree.Node node37 = aVLTree0.find((int)(short)1);
    aVLTree0.delete(2);
    int i40 = aVLTree0.height();
    aVLTree0.insert((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    int i27 = aVLTree0.height();
    AVLTree aVLTree28 = new AVLTree();
    aVLTree28.insert(0);
    AVLTree.Node node32 = aVLTree28.find(100);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    aVLTree33.insert(0);
    int i38 = aVLTree33.height();
    aVLTree33.delete((int)(byte)-1);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    int i49 = aVLTree33.getBalance(node48);
    int i50 = aVLTree28.getBalance(node48);
    aVLTree28.insert((int)(short)-1);
    aVLTree28.delete((int)'4');
    aVLTree28.delete((int)' ');
    AVLTree.Node node58 = aVLTree28.find((int)(byte)0);
    int i59 = aVLTree0.getBalance(node58);
    AVLTree.Node node60 = aVLTree0.getRoot();
    AVLTree aVLTree61 = new AVLTree();
    AVLTree.Node node62 = null;
    int i63 = aVLTree61.getBalance(node62);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree.Node node68 = aVLTree64.find((int)'4');
    aVLTree64.insert(0);
    AVLTree.Node node71 = aVLTree64.getRoot();
    int i72 = aVLTree61.getBalance(node71);
    AVLTree aVLTree73 = new AVLTree();
    AVLTree.Node node74 = null;
    int i75 = aVLTree73.getBalance(node74);
    AVLTree.Node node77 = aVLTree73.find((int)'4');
    aVLTree73.insert(0);
    AVLTree.Node node80 = aVLTree73.getRoot();
    AVLTree.Node node81 = aVLTree73.getRoot();
    int i82 = aVLTree61.getBalance(node81);
    aVLTree61.insert(1);
    AVLTree.Node node86 = aVLTree61.find((int)'#');
    AVLTree.Node node88 = aVLTree61.find((int)(short)1);
    int i89 = aVLTree0.getBalance(node88);
    int i90 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node26 = aVLTree0.find(10);
    aVLTree0.insert((int)' ');
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree0.getBalance(node37);
    AVLTree.Node node39 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    int i9 = aVLTree0.height();
    aVLTree0.insert(10);
    AVLTree.Node node13 = aVLTree0.find(10);
    int i14 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find((int)(short)-1);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree5.getBalance(node15);
    int i17 = aVLTree0.getBalance(node15);
    AVLTree.Node node19 = aVLTree0.find((int)(byte)0);
    aVLTree0.insert((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    AVLTree.Node node6 = aVLTree0.find(10);
    aVLTree0.delete(2);
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node26 = aVLTree0.find(10);
    aVLTree0.insert((int)' ');
    AVLTree.Node node30 = aVLTree0.find((int)(short)100);
    aVLTree0.delete((int)(byte)0);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    aVLTree33.insert(0);
    int i38 = aVLTree33.height();
    aVLTree33.delete((int)(byte)-1);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    aVLTree41.insert((int)(byte)10);
    AVLTree.Node node51 = aVLTree41.find((int)(short)1);
    AVLTree.Node node52 = aVLTree41.getRoot();
    int i53 = aVLTree33.getBalance(node52);
    AVLTree aVLTree54 = new AVLTree();
    AVLTree.Node node55 = null;
    int i56 = aVLTree54.getBalance(node55);
    AVLTree.Node node58 = aVLTree54.find((int)'4');
    aVLTree54.insert(0);
    int i61 = aVLTree54.height();
    AVLTree.Node node63 = aVLTree54.find((int)(short)-1);
    AVLTree.Node node65 = aVLTree54.find((int)'#');
    AVLTree aVLTree66 = new AVLTree();
    AVLTree.Node node67 = null;
    int i68 = aVLTree66.getBalance(node67);
    aVLTree66.insert(0);
    AVLTree.Node node71 = aVLTree66.getRoot();
    AVLTree.Node node72 = aVLTree66.getRoot();
    AVLTree.Node node74 = aVLTree66.find((int)(short)10);
    AVLTree.Node node75 = aVLTree66.getRoot();
    int i76 = aVLTree54.getBalance(node75);
    int i77 = aVLTree33.getBalance(node75);
    AVLTree aVLTree78 = new AVLTree();
    AVLTree.Node node79 = null;
    int i80 = aVLTree78.getBalance(node79);
    AVLTree.Node node82 = aVLTree78.find((int)'4');
    aVLTree78.insert(0);
    int i85 = aVLTree78.height();
    AVLTree.Node node87 = aVLTree78.find((int)(short)-1);
    aVLTree78.insert((int)(short)1);
    AVLTree.Node node90 = aVLTree78.getRoot();
    int i91 = aVLTree78.height();
    AVLTree.Node node93 = aVLTree78.find(0);
    int i94 = aVLTree33.getBalance(node93);
    int i95 = aVLTree0.getBalance(node93);
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node98 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node98);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node49 = aVLTree0.getRoot();
    AVLTree.Node node51 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node54 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.delete((int)'#');
    AVLTree.Node node12 = aVLTree0.find(2);
    AVLTree.Node node14 = aVLTree0.find((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    int i3 = aVLTree0.height();
    int i4 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.find((int)(short)1);
    aVLTree0.delete((int)'#');
    AVLTree.Node node10 = aVLTree0.find(1);
    AVLTree aVLTree11 = new AVLTree();
    aVLTree11.insert(0);
    AVLTree.Node node14 = aVLTree11.getRoot();
    aVLTree11.delete((int)(byte)100);
    int i17 = aVLTree11.height();
    AVLTree.Node node19 = aVLTree11.find((int)(short)0);
    AVLTree.Node node20 = aVLTree11.getRoot();
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    AVLTree.Node node25 = aVLTree21.find((int)'4');
    aVLTree21.insert(0);
    AVLTree.Node node28 = aVLTree21.getRoot();
    AVLTree.Node node29 = aVLTree21.getRoot();
    int i30 = aVLTree21.height();
    AVLTree.Node node31 = aVLTree21.getRoot();
    AVLTree.Node node33 = aVLTree21.find((int)'4');
    aVLTree21.delete(0);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    aVLTree36.insert(0);
    int i41 = aVLTree36.height();
    aVLTree36.delete((int)(byte)1);
    aVLTree36.delete(100);
    AVLTree aVLTree46 = new AVLTree();
    aVLTree46.insert(0);
    AVLTree.Node node50 = aVLTree46.find(100);
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    aVLTree51.insert(0);
    int i56 = aVLTree51.height();
    aVLTree51.delete((int)(byte)-1);
    AVLTree aVLTree59 = new AVLTree();
    AVLTree.Node node60 = null;
    int i61 = aVLTree59.getBalance(node60);
    AVLTree.Node node63 = aVLTree59.find((int)'4');
    aVLTree59.insert(0);
    AVLTree.Node node66 = aVLTree59.getRoot();
    int i67 = aVLTree51.getBalance(node66);
    int i68 = aVLTree46.getBalance(node66);
    aVLTree46.insert((int)(short)-1);
    AVLTree.Node node72 = aVLTree46.find(10);
    aVLTree46.insert((int)' ');
    AVLTree aVLTree75 = new AVLTree();
    AVLTree.Node node76 = null;
    int i77 = aVLTree75.getBalance(node76);
    AVLTree.Node node79 = aVLTree75.find((int)'4');
    aVLTree75.insert(0);
    AVLTree.Node node82 = aVLTree75.getRoot();
    AVLTree.Node node83 = aVLTree75.getRoot();
    int i84 = aVLTree46.getBalance(node83);
    int i85 = aVLTree36.getBalance(node83);
    AVLTree.Node node86 = aVLTree36.getRoot();
    AVLTree.Node node87 = aVLTree36.getRoot();
    AVLTree.Node node88 = aVLTree36.getRoot();
    int i89 = aVLTree21.getBalance(node88);
    int i90 = aVLTree11.getBalance(node88);
    int i91 = aVLTree0.getBalance(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)'#');
    AVLTree.Node node35 = aVLTree0.getRoot();
    AVLTree.Node node37 = aVLTree0.find(1);
    AVLTree.Node node39 = aVLTree0.find((int)(byte)10);
    int i40 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    AVLTree.Node node18 = aVLTree0.find((int)(short)0);
    AVLTree.Node node19 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    AVLTree.Node node23 = aVLTree0.find(0);
    aVLTree0.delete((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete(100);
    aVLTree0.delete((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    int i25 = aVLTree0.height();
    AVLTree.Node node26 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    int i16 = aVLTree9.height();
    AVLTree.Node node18 = aVLTree9.find((int)(short)-1);
    AVLTree.Node node20 = aVLTree9.find((int)'#');
    int i21 = aVLTree9.height();
    AVLTree.Node node22 = aVLTree9.getRoot();
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree.Node node27 = aVLTree23.find((int)'4');
    aVLTree23.insert(0);
    AVLTree.Node node30 = aVLTree23.getRoot();
    AVLTree.Node node31 = aVLTree23.getRoot();
    int i32 = aVLTree23.height();
    AVLTree.Node node33 = aVLTree23.getRoot();
    AVLTree.Node node34 = aVLTree23.getRoot();
    int i35 = aVLTree9.getBalance(node34);
    int i36 = aVLTree0.getBalance(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(10);
    AVLTree.Node node27 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node14 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)1);
    AVLTree.Node node16 = aVLTree0.find((-1));
    aVLTree0.delete(10);
    aVLTree0.delete(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree25.height();
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    int i40 = aVLTree33.height();
    AVLTree.Node node42 = aVLTree33.find((int)(short)-1);
    aVLTree33.insert((int)(short)1);
    AVLTree.Node node45 = aVLTree33.getRoot();
    aVLTree33.delete((int)(byte)0);
    aVLTree33.delete((int)(short)10);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree aVLTree53 = new AVLTree();
    AVLTree.Node node54 = null;
    int i55 = aVLTree53.getBalance(node54);
    AVLTree.Node node57 = aVLTree53.find((int)'4');
    aVLTree53.insert(0);
    AVLTree.Node node60 = aVLTree53.getRoot();
    int i61 = aVLTree50.getBalance(node60);
    int i62 = aVLTree33.getBalance(node60);
    AVLTree.Node node63 = aVLTree33.getRoot();
    AVLTree.Node node65 = aVLTree33.find((int)(short)1);
    int i66 = aVLTree25.getBalance(node65);
    int i67 = aVLTree0.getBalance(node65);
    aVLTree0.insert((int)'a');
    AVLTree.Node node71 = aVLTree0.find((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    AVLTree.Node node18 = aVLTree0.find((int)(byte)10);
    AVLTree.Node node20 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((-1));
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree.Node node27 = aVLTree23.find((int)'4');
    aVLTree23.insert(0);
    int i30 = aVLTree23.height();
    AVLTree.Node node32 = aVLTree23.find((int)(short)-1);
    aVLTree23.insert((int)(short)1);
    AVLTree.Node node35 = aVLTree23.getRoot();
    int i36 = aVLTree23.height();
    AVLTree.Node node38 = aVLTree23.find(0);
    AVLTree.Node node39 = aVLTree23.getRoot();
    int i40 = aVLTree0.getBalance(node39);
    AVLTree.Node node41 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)(short)10);
    AVLTree.Node node35 = aVLTree0.getRoot();
    AVLTree.Node node37 = aVLTree0.find((int)(short)1);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    int i45 = aVLTree38.height();
    AVLTree.Node node47 = aVLTree38.find((int)(byte)-1);
    aVLTree38.delete((int)(byte)10);
    AVLTree.Node node50 = aVLTree38.getRoot();
    int i51 = aVLTree0.getBalance(node50);
    AVLTree.Node node53 = aVLTree0.find((int)(byte)0);
    AVLTree.Node node54 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node6 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)' ');
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree.Node node14 = aVLTree10.find((int)'4');
    aVLTree10.insert(0);
    aVLTree10.insert((int)(byte)10);
    AVLTree.Node node20 = aVLTree10.find((int)(short)1);
    AVLTree.Node node22 = aVLTree10.find((int)(byte)100);
    int i23 = aVLTree10.height();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    int i33 = aVLTree24.getBalance(node32);
    int i34 = aVLTree10.getBalance(node32);
    int i35 = aVLTree0.getBalance(node32);
    AVLTree.Node node37 = aVLTree0.find(0);
    aVLTree0.delete(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node13 = aVLTree0.find((int)'a');
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    aVLTree14.insert(0);
    AVLTree.Node node19 = aVLTree14.getRoot();
    AVLTree.Node node20 = aVLTree14.getRoot();
    AVLTree.Node node22 = aVLTree14.find((int)(short)10);
    AVLTree.Node node23 = aVLTree14.getRoot();
    int i24 = aVLTree14.height();
    AVLTree.Node node25 = aVLTree14.getRoot();
    int i26 = aVLTree0.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    int i34 = aVLTree27.height();
    AVLTree.Node node36 = aVLTree27.find((int)(short)-1);
    aVLTree27.insert((int)(short)1);
    AVLTree.Node node39 = aVLTree27.getRoot();
    aVLTree27.delete((int)(byte)0);
    aVLTree27.delete((int)(short)10);
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree.Node node51 = aVLTree47.find((int)'4');
    aVLTree47.insert(0);
    AVLTree.Node node54 = aVLTree47.getRoot();
    int i55 = aVLTree44.getBalance(node54);
    int i56 = aVLTree27.getBalance(node54);
    int i57 = aVLTree0.getBalance(node54);
    AVLTree aVLTree58 = new AVLTree();
    AVLTree.Node node59 = null;
    int i60 = aVLTree58.getBalance(node59);
    aVLTree58.insert(0);
    int i63 = aVLTree58.height();
    aVLTree58.delete((int)(byte)-1);
    int i66 = aVLTree58.height();
    aVLTree58.delete((int)(short)1);
    int i69 = aVLTree58.height();
    AVLTree.Node node71 = aVLTree58.find((int)(short)1);
    aVLTree58.insert((int)'#');
    aVLTree58.delete((int)(short)-1);
    AVLTree.Node node76 = aVLTree58.getRoot();
    int i77 = aVLTree0.getBalance(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    AVLTree.Node node32 = aVLTree27.getRoot();
    AVLTree.Node node33 = aVLTree27.getRoot();
    AVLTree.Node node35 = aVLTree27.find((int)(short)10);
    aVLTree27.insert((int)(byte)1);
    AVLTree.Node node38 = aVLTree27.getRoot();
    AVLTree.Node node40 = aVLTree27.find(0);
    int i41 = aVLTree0.getBalance(node40);
    aVLTree0.delete(10);
    AVLTree.Node node45 = aVLTree0.find((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    aVLTree5.insert(0);
    AVLTree.Node node8 = aVLTree5.getRoot();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    int i16 = aVLTree9.height();
    AVLTree.Node node18 = aVLTree9.find((int)(short)-1);
    aVLTree9.insert((int)(short)1);
    AVLTree.Node node21 = aVLTree9.getRoot();
    aVLTree9.delete((int)(byte)0);
    aVLTree9.delete((int)(short)10);
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    int i37 = aVLTree26.getBalance(node36);
    int i38 = aVLTree9.getBalance(node36);
    int i39 = aVLTree5.getBalance(node36);
    int i40 = aVLTree0.getBalance(node36);
    int i41 = aVLTree0.height();
    int i42 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.delete((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    aVLTree0.delete((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    aVLTree11.insert(0);
    AVLTree.Node node16 = aVLTree11.getRoot();
    aVLTree11.delete((int)(byte)100);
    AVLTree.Node node19 = aVLTree11.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree aVLTree11 = new AVLTree();
    aVLTree11.insert(0);
    AVLTree.Node node15 = aVLTree11.find(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    int i21 = aVLTree16.height();
    aVLTree16.delete((int)(byte)-1);
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree.Node node28 = aVLTree24.find((int)'4');
    aVLTree24.insert(0);
    AVLTree.Node node31 = aVLTree24.getRoot();
    int i32 = aVLTree16.getBalance(node31);
    int i33 = aVLTree11.getBalance(node31);
    aVLTree11.insert((int)(short)-1);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    aVLTree36.insert(0);
    AVLTree.Node node41 = aVLTree36.getRoot();
    AVLTree.Node node42 = aVLTree36.getRoot();
    int i43 = aVLTree11.getBalance(node42);
    aVLTree11.delete(100);
    aVLTree11.insert(10);
    AVLTree aVLTree48 = new AVLTree();
    AVLTree.Node node49 = null;
    int i50 = aVLTree48.getBalance(node49);
    AVLTree.Node node52 = aVLTree48.find((int)'4');
    aVLTree48.insert(0);
    aVLTree48.insert((int)(byte)10);
    AVLTree.Node node57 = aVLTree48.getRoot();
    aVLTree48.insert((int)(short)100);
    AVLTree.Node node61 = aVLTree48.find((int)'a');
    AVLTree aVLTree62 = new AVLTree();
    AVLTree.Node node63 = null;
    int i64 = aVLTree62.getBalance(node63);
    aVLTree62.insert(0);
    AVLTree.Node node67 = aVLTree62.getRoot();
    AVLTree.Node node68 = aVLTree62.getRoot();
    AVLTree.Node node70 = aVLTree62.find((int)(short)10);
    AVLTree.Node node71 = aVLTree62.getRoot();
    int i72 = aVLTree62.height();
    AVLTree.Node node73 = aVLTree62.getRoot();
    int i74 = aVLTree48.getBalance(node73);
    int i75 = aVLTree11.getBalance(node73);
    AVLTree.Node node76 = aVLTree11.getRoot();
    int i77 = aVLTree0.getBalance(node76);
    AVLTree.Node node79 = aVLTree0.find((int)(short)100);
    AVLTree.Node node81 = aVLTree0.find((int)'a');
    AVLTree.Node node82 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node82);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node12 = aVLTree0.find((int)(short)10);
    aVLTree0.delete((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    aVLTree6.insert(0);
    AVLTree.Node node11 = aVLTree6.getRoot();
    AVLTree.Node node12 = aVLTree6.getRoot();
    AVLTree.Node node14 = aVLTree6.find((int)(short)10);
    AVLTree.Node node15 = aVLTree6.getRoot();
    AVLTree.Node node16 = aVLTree6.getRoot();
    int i17 = aVLTree0.getBalance(node16);
    AVLTree.Node node19 = aVLTree0.find(10);
    AVLTree.Node node21 = aVLTree0.find(0);
    int i22 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    AVLTree.Node node24 = aVLTree13.find((int)'#');
    int i25 = aVLTree13.height();
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    aVLTree28.insert((int)(short)1);
    AVLTree.Node node40 = aVLTree28.getRoot();
    aVLTree28.delete((int)(byte)0);
    AVLTree.Node node43 = aVLTree28.getRoot();
    int i44 = aVLTree0.getBalance(node43);
    aVLTree0.delete((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree18 = new AVLTree();
    aVLTree18.insert(0);
    AVLTree.Node node22 = aVLTree18.find(100);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    int i28 = aVLTree23.height();
    aVLTree23.delete((int)(byte)-1);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree23.getBalance(node38);
    int i40 = aVLTree18.getBalance(node38);
    AVLTree aVLTree41 = new AVLTree();
    aVLTree41.insert(0);
    AVLTree.Node node44 = aVLTree41.getRoot();
    int i45 = aVLTree18.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)10);
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(short)-1);
    AVLTree.Node node29 = aVLTree18.find((int)'#');
    AVLTree.Node node31 = aVLTree18.find((int)(byte)-1);
    aVLTree18.delete(100);
    AVLTree.Node node34 = aVLTree18.getRoot();
    AVLTree.Node node35 = aVLTree18.getRoot();
    aVLTree18.delete((int)' ');
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    aVLTree38.insert(0);
    AVLTree.Node node43 = aVLTree38.getRoot();
    aVLTree38.delete((int)(byte)100);
    aVLTree38.delete((int)(short)10);
    AVLTree aVLTree48 = new AVLTree();
    AVLTree.Node node49 = null;
    int i50 = aVLTree48.getBalance(node49);
    AVLTree.Node node52 = aVLTree48.find((int)'4');
    aVLTree48.insert(0);
    AVLTree.Node node55 = aVLTree48.getRoot();
    AVLTree.Node node56 = aVLTree48.getRoot();
    int i57 = aVLTree48.height();
    AVLTree.Node node58 = aVLTree48.getRoot();
    int i59 = aVLTree38.getBalance(node58);
    AVLTree.Node node61 = aVLTree38.find((int)(byte)10);
    int i62 = aVLTree38.height();
    AVLTree.Node node63 = aVLTree38.getRoot();
    int i64 = aVLTree18.getBalance(node63);
    int i65 = aVLTree0.getBalance(node63);
    AVLTree.Node node66 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    int i6 = aVLTree0.height();
    AVLTree aVLTree7 = new AVLTree();
    AVLTree.Node node8 = null;
    int i9 = aVLTree7.getBalance(node8);
    aVLTree7.insert(0);
    AVLTree.Node node12 = aVLTree7.getRoot();
    int i13 = aVLTree0.getBalance(node12);
    int i14 = aVLTree0.height();
    aVLTree0.delete((int)(byte)0);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    int i24 = aVLTree17.height();
    AVLTree.Node node26 = aVLTree17.find((int)(short)-1);
    aVLTree17.insert((int)(short)1);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    aVLTree29.insert(0);
    AVLTree.Node node34 = aVLTree29.getRoot();
    AVLTree.Node node35 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.find((int)(short)10);
    aVLTree29.insert((int)(byte)1);
    AVLTree.Node node40 = aVLTree29.getRoot();
    int i41 = aVLTree17.getBalance(node40);
    aVLTree17.delete((int)'#');
    AVLTree.Node node45 = aVLTree17.find((int)(byte)10);
    aVLTree17.delete((int)'4');
    AVLTree.Node node49 = aVLTree17.find((-1));
    aVLTree17.delete((int)(short)0);
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    AVLTree.Node node56 = aVLTree52.find((int)(byte)1);
    AVLTree.Node node58 = aVLTree52.find((int)(short)10);
    aVLTree52.insert((int)' ');
    int i61 = aVLTree52.height();
    AVLTree aVLTree62 = new AVLTree();
    AVLTree.Node node63 = null;
    int i64 = aVLTree62.getBalance(node63);
    AVLTree.Node node66 = aVLTree62.find((int)'4');
    aVLTree62.insert(0);
    aVLTree62.insert((int)(byte)10);
    AVLTree.Node node72 = aVLTree62.find((int)(short)1);
    AVLTree.Node node74 = aVLTree62.find((int)(byte)100);
    int i75 = aVLTree62.height();
    AVLTree aVLTree76 = new AVLTree();
    AVLTree aVLTree77 = new AVLTree();
    AVLTree.Node node78 = null;
    int i79 = aVLTree77.getBalance(node78);
    AVLTree.Node node81 = aVLTree77.find((int)'4');
    aVLTree77.insert(0);
    AVLTree.Node node84 = aVLTree77.getRoot();
    int i85 = aVLTree76.getBalance(node84);
    int i86 = aVLTree62.getBalance(node84);
    int i87 = aVLTree52.getBalance(node84);
    int i88 = aVLTree17.getBalance(node84);
    int i89 = aVLTree0.getBalance(node84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)100);
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.find(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node49 = aVLTree0.getRoot();
    AVLTree.Node node51 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node55 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    int i3 = aVLTree0.height();
    int i4 = aVLTree0.height();
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    AVLTree.Node node10 = aVLTree5.getRoot();
    AVLTree.Node node11 = aVLTree5.getRoot();
    AVLTree.Node node13 = aVLTree5.find((int)(short)10);
    AVLTree.Node node14 = aVLTree5.getRoot();
    AVLTree.Node node15 = aVLTree5.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    aVLTree0.delete((int)(byte)1);
    int i19 = aVLTree0.height();
    int i20 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find(2);
    int i17 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree20 = new AVLTree();
    aVLTree20.delete((int)(short)1);
    AVLTree.Node node24 = aVLTree20.find((int)(byte)0);
    int i25 = aVLTree20.height();
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    AVLTree.Node node34 = aVLTree26.getRoot();
    aVLTree26.insert((int)(byte)1);
    aVLTree26.delete(100);
    AVLTree.Node node39 = aVLTree26.getRoot();
    int i40 = aVLTree20.getBalance(node39);
    int i41 = aVLTree0.getBalance(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    AVLTree.Node node18 = aVLTree0.find(1);
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    aVLTree19.insert(0);
    int i24 = aVLTree19.height();
    aVLTree19.delete((int)(byte)-1);
    int i27 = aVLTree19.height();
    aVLTree19.delete((int)(short)1);
    int i30 = aVLTree19.height();
    aVLTree19.insert((int)'a');
    AVLTree.Node node34 = aVLTree19.find(0);
    int i35 = aVLTree0.getBalance(node34);
    AVLTree.Node node37 = aVLTree0.find((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.find((-1));
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(byte)-1);
    int i28 = aVLTree18.height();
    int i29 = aVLTree18.height();
    aVLTree18.delete((int)'4');
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    AVLTree.Node node36 = aVLTree32.find((int)'4');
    aVLTree32.insert(0);
    int i39 = aVLTree32.height();
    AVLTree.Node node41 = aVLTree32.find((int)(short)-1);
    AVLTree.Node node43 = aVLTree32.find((int)'#');
    AVLTree.Node node44 = aVLTree32.getRoot();
    int i45 = aVLTree18.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(100);
    AVLTree aVLTree10 = new AVLTree();
    aVLTree10.insert(0);
    AVLTree.Node node14 = aVLTree10.find(100);
    AVLTree aVLTree15 = new AVLTree();
    AVLTree.Node node16 = null;
    int i17 = aVLTree15.getBalance(node16);
    aVLTree15.insert(0);
    int i20 = aVLTree15.height();
    aVLTree15.delete((int)(byte)-1);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree.Node node27 = aVLTree23.find((int)'4');
    aVLTree23.insert(0);
    AVLTree.Node node30 = aVLTree23.getRoot();
    int i31 = aVLTree15.getBalance(node30);
    int i32 = aVLTree10.getBalance(node30);
    aVLTree10.insert((int)(short)-1);
    AVLTree.Node node36 = aVLTree10.find(10);
    aVLTree10.insert((int)' ');
    AVLTree aVLTree39 = new AVLTree();
    AVLTree.Node node40 = null;
    int i41 = aVLTree39.getBalance(node40);
    AVLTree.Node node43 = aVLTree39.find((int)'4');
    aVLTree39.insert(0);
    AVLTree.Node node46 = aVLTree39.getRoot();
    AVLTree.Node node47 = aVLTree39.getRoot();
    int i48 = aVLTree10.getBalance(node47);
    int i49 = aVLTree0.getBalance(node47);
    AVLTree.Node node50 = aVLTree0.getRoot();
    AVLTree.Node node51 = aVLTree0.getRoot();
    int i52 = aVLTree0.height();
    AVLTree.Node node53 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    aVLTree0.insert((int)' ');
    int i14 = aVLTree0.height();
    aVLTree0.delete((int)(short)10);
    aVLTree0.insert((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)-1);
    AVLTree.Node node18 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)'4');
    aVLTree0.insert((-1));
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    AVLTree.Node node25 = aVLTree18.getRoot();
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    aVLTree26.insert(0);
    AVLTree.Node node31 = aVLTree26.getRoot();
    aVLTree26.insert((int)(short)-1);
    AVLTree.Node node34 = aVLTree26.getRoot();
    AVLTree.Node node36 = aVLTree26.find((int)(short)0);
    AVLTree.Node node37 = aVLTree26.getRoot();
    int i38 = aVLTree18.getBalance(node37);
    int i39 = aVLTree0.getBalance(node37);
    AVLTree.Node node41 = aVLTree0.find((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    int i27 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    aVLTree0.delete(0);
    aVLTree0.insert((int)(short)0);
    AVLTree.Node node35 = aVLTree0.find((int)'#');
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    int i43 = aVLTree36.height();
    AVLTree.Node node45 = aVLTree36.find((int)(short)-1);
    aVLTree36.insert((int)(short)1);
    AVLTree aVLTree48 = new AVLTree();
    AVLTree.Node node49 = null;
    int i50 = aVLTree48.getBalance(node49);
    aVLTree48.insert(0);
    AVLTree.Node node53 = aVLTree48.getRoot();
    AVLTree.Node node54 = aVLTree48.getRoot();
    AVLTree.Node node56 = aVLTree48.find((int)(short)10);
    aVLTree48.insert((int)(byte)1);
    AVLTree.Node node59 = aVLTree48.getRoot();
    int i60 = aVLTree36.getBalance(node59);
    aVLTree36.delete((int)'#');
    AVLTree.Node node64 = aVLTree36.find((int)(short)1);
    AVLTree.Node node65 = aVLTree36.getRoot();
    int i66 = aVLTree0.getBalance(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)10);
    aVLTree0.insert((int)(short)10);
    int i20 = aVLTree0.height();
    int i21 = aVLTree0.height();
    aVLTree0.delete((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert((int)' ');
    AVLTree aVLTree7 = new AVLTree();
    AVLTree.Node node8 = null;
    int i9 = aVLTree7.getBalance(node8);
    AVLTree.Node node11 = aVLTree7.find((int)'4');
    aVLTree7.insert(0);
    int i14 = aVLTree7.height();
    AVLTree.Node node16 = aVLTree7.find((int)(short)-1);
    AVLTree.Node node18 = aVLTree7.find((int)'#');
    AVLTree.Node node20 = aVLTree7.find((int)(byte)-1);
    aVLTree7.delete(100);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    AVLTree.Node node28 = aVLTree23.getRoot();
    AVLTree.Node node29 = aVLTree23.getRoot();
    int i30 = aVLTree7.getBalance(node29);
    AVLTree.Node node31 = aVLTree7.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    AVLTree.Node node33 = aVLTree0.getRoot();
    AVLTree.Node node35 = aVLTree0.find((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    AVLTree aVLTree23 = new AVLTree();
    aVLTree23.insert(0);
    AVLTree.Node node26 = aVLTree23.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    aVLTree0.insert((int)(byte)100);
    AVLTree.Node node30 = aVLTree0.getRoot();
    AVLTree.Node node32 = aVLTree0.find(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    aVLTree0.delete((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.find((int)(byte)0);
    aVLTree0.delete((int)(short)-1);
    aVLTree0.insert(2);
    AVLTree.Node node18 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    int i3 = aVLTree0.height();
    int i4 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.find((int)(short)1);
    aVLTree0.delete((int)'#');
    int i9 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node24 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    AVLTree.Node node28 = aVLTree0.find((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    int i16 = aVLTree0.height();
    int i17 = aVLTree0.height();
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    AVLTree.Node node25 = aVLTree18.getRoot();
    AVLTree.Node node26 = aVLTree18.getRoot();
    int i27 = aVLTree18.height();
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree28.getBalance(node38);
    int i40 = aVLTree18.getBalance(node38);
    aVLTree18.delete((int)(short)10);
    AVLTree.Node node43 = aVLTree18.getRoot();
    int i44 = aVLTree0.getBalance(node43);
    AVLTree aVLTree45 = new AVLTree();
    aVLTree45.insert(0);
    AVLTree.Node node49 = aVLTree45.find(100);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    aVLTree50.insert(0);
    int i55 = aVLTree50.height();
    aVLTree50.delete((int)(byte)-1);
    AVLTree aVLTree58 = new AVLTree();
    AVLTree.Node node59 = null;
    int i60 = aVLTree58.getBalance(node59);
    AVLTree.Node node62 = aVLTree58.find((int)'4');
    aVLTree58.insert(0);
    AVLTree.Node node65 = aVLTree58.getRoot();
    int i66 = aVLTree50.getBalance(node65);
    int i67 = aVLTree45.getBalance(node65);
    aVLTree45.insert((int)(short)-1);
    aVLTree45.delete((int)'4');
    AVLTree.Node node73 = aVLTree45.find(100);
    aVLTree45.insert((int)(byte)10);
    AVLTree.Node node77 = aVLTree45.find((int)(short)1);
    aVLTree45.insert(2);
    AVLTree.Node node80 = aVLTree45.getRoot();
    int i81 = aVLTree0.getBalance(node80);
    AVLTree.Node node83 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node83);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    aVLTree0.insert((int)'a');
    AVLTree.Node node60 = aVLTree0.find((-1));
    AVLTree.Node node62 = aVLTree0.find(0);
    AVLTree.Node node63 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    int i22 = aVLTree0.height();
    aVLTree0.insert(100);
    AVLTree.Node node25 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    AVLTree.Node node29 = aVLTree0.find((int)(short)10);
    aVLTree0.delete((int)(short)10);
    int i32 = aVLTree0.height();
    AVLTree.Node node34 = aVLTree0.find(0);
    int i35 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    int i12 = aVLTree0.height();
    int i13 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    aVLTree0.delete((int)'a');
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(short)-1);
    aVLTree18.insert((int)(short)1);
    aVLTree18.delete((int)(byte)0);
    aVLTree18.insert(100);
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    aVLTree34.insert(0);
    AVLTree.Node node39 = aVLTree34.getRoot();
    aVLTree34.insert((int)(short)-1);
    AVLTree.Node node42 = aVLTree34.getRoot();
    int i43 = aVLTree18.getBalance(node42);
    int i44 = aVLTree0.getBalance(node42);
    AVLTree.Node node46 = aVLTree0.find((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(100);
    AVLTree.Node node10 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    aVLTree0.delete(1);
    aVLTree0.delete((int)(byte)100);
    aVLTree0.insert((int)'#');
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node21 = aVLTree0.getRoot();
    AVLTree.Node node23 = aVLTree0.find((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)0);
    int i24 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node28 = aVLTree0.find((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    int i6 = aVLTree0.height();
    int i7 = aVLTree0.height();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)' ');
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    aVLTree0.insert((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    int i25 = aVLTree0.height();
    AVLTree.Node node27 = aVLTree0.find((int)'4');
    aVLTree0.delete((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    aVLTree13.insert((int)(short)-1);
    AVLTree.Node node21 = aVLTree13.getRoot();
    AVLTree aVLTree22 = new AVLTree();
    aVLTree22.insert(0);
    AVLTree.Node node26 = aVLTree22.find(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    int i32 = aVLTree27.height();
    aVLTree27.delete((int)(byte)-1);
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    AVLTree.Node node39 = aVLTree35.find((int)'4');
    aVLTree35.insert(0);
    AVLTree.Node node42 = aVLTree35.getRoot();
    int i43 = aVLTree27.getBalance(node42);
    int i44 = aVLTree22.getBalance(node42);
    aVLTree22.insert((int)(short)-1);
    AVLTree.Node node48 = aVLTree22.find(10);
    aVLTree22.insert((int)' ');
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    AVLTree.Node node58 = aVLTree51.getRoot();
    AVLTree.Node node59 = aVLTree51.getRoot();
    int i60 = aVLTree22.getBalance(node59);
    int i61 = aVLTree13.getBalance(node59);
    int i62 = aVLTree0.getBalance(node59);
    aVLTree0.delete((int)'#');
    AVLTree.Node node66 = aVLTree0.find((-1));
    aVLTree0.delete((int)'4');
    AVLTree.Node node69 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node69);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.delete(10);
    aVLTree0.insert((int)(short)1);
    int i15 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    int i7 = aVLTree0.height();
    int i8 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    int i13 = aVLTree0.height();
    int i14 = aVLTree0.height();
    aVLTree0.insert((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)' ');
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    aVLTree13.insert((int)(short)1);
    AVLTree.Node node25 = aVLTree13.getRoot();
    aVLTree13.delete((int)(byte)0);
    aVLTree13.delete((int)(short)10);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    AVLTree.Node node40 = aVLTree33.getRoot();
    int i41 = aVLTree30.getBalance(node40);
    int i42 = aVLTree13.getBalance(node40);
    int i43 = aVLTree0.getBalance(node40);
    AVLTree.Node node44 = aVLTree0.getRoot();
    aVLTree0.insert(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    aVLTree0.insert(100);
    aVLTree0.delete(1);
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node20 = aVLTree0.find((-1));
    AVLTree.Node node22 = aVLTree0.find(100);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree.Node node24 = aVLTree0.getRoot();
    int i25 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node25 = aVLTree0.find((int)(short)0);
    AVLTree.Node node27 = aVLTree0.find(100);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node31 = null;
    int i32 = aVLTree28.getBalance(node31);
    AVLTree.Node node34 = aVLTree28.find((int)'4');
    int i35 = aVLTree28.height();
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    aVLTree36.insert(0);
    AVLTree.Node node41 = aVLTree36.getRoot();
    AVLTree.Node node42 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.find((int)(short)10);
    AVLTree.Node node45 = aVLTree36.getRoot();
    int i46 = aVLTree36.height();
    AVLTree.Node node47 = aVLTree36.getRoot();
    int i48 = aVLTree36.height();
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    aVLTree49.insert(0);
    AVLTree.Node node54 = aVLTree49.getRoot();
    AVLTree.Node node55 = aVLTree49.getRoot();
    AVLTree.Node node57 = aVLTree49.find((int)(short)10);
    AVLTree.Node node58 = aVLTree49.getRoot();
    int i59 = aVLTree49.height();
    AVLTree.Node node60 = aVLTree49.getRoot();
    int i61 = aVLTree49.height();
    AVLTree.Node node62 = aVLTree49.getRoot();
    int i63 = aVLTree36.getBalance(node62);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree.Node node68 = aVLTree64.find((int)'4');
    aVLTree64.insert(0);
    AVLTree.Node node71 = aVLTree64.getRoot();
    AVLTree.Node node72 = aVLTree64.getRoot();
    aVLTree64.insert((int)(byte)1);
    AVLTree aVLTree75 = new AVLTree();
    AVLTree.Node node76 = null;
    int i77 = aVLTree75.getBalance(node76);
    aVLTree75.insert(0);
    int i80 = aVLTree75.height();
    aVLTree75.delete((int)(byte)-1);
    AVLTree aVLTree83 = new AVLTree();
    AVLTree.Node node84 = null;
    int i85 = aVLTree83.getBalance(node84);
    AVLTree.Node node87 = aVLTree83.find((int)'4');
    aVLTree83.insert(0);
    AVLTree.Node node90 = aVLTree83.getRoot();
    int i91 = aVLTree75.getBalance(node90);
    int i92 = aVLTree64.getBalance(node90);
    int i93 = aVLTree36.getBalance(node90);
    int i94 = aVLTree28.getBalance(node90);
    int i95 = aVLTree0.getBalance(node90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    aVLTree0.insert((int)'a');
    AVLTree aVLTree59 = new AVLTree();
    aVLTree59.insert(0);
    AVLTree.Node node63 = aVLTree59.find((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    AVLTree.Node node71 = aVLTree67.find((int)'4');
    aVLTree67.insert(0);
    AVLTree.Node node74 = aVLTree67.getRoot();
    int i75 = aVLTree64.getBalance(node74);
    int i76 = aVLTree59.getBalance(node74);
    int i77 = aVLTree0.getBalance(node74);
    int i78 = aVLTree0.height();
    AVLTree.Node node80 = aVLTree0.find(1);
    AVLTree.Node node82 = aVLTree0.find(1);
    aVLTree0.delete((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node82);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    int i13 = aVLTree0.height();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    AVLTree.Node node20 = aVLTree14.find(10);
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    AVLTree.Node node25 = aVLTree21.find((int)'4');
    aVLTree21.insert(0);
    AVLTree.Node node28 = aVLTree21.getRoot();
    AVLTree.Node node29 = aVLTree21.getRoot();
    aVLTree21.delete((int)'#');
    int i32 = aVLTree21.height();
    AVLTree.Node node34 = aVLTree21.find((int)'#');
    AVLTree.Node node35 = aVLTree21.getRoot();
    int i36 = aVLTree14.getBalance(node35);
    int i37 = aVLTree0.getBalance(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    aVLTree0.delete(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.insert(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    AVLTree.Node node21 = aVLTree13.getRoot();
    int i22 = aVLTree13.height();
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    int i34 = aVLTree23.getBalance(node33);
    int i35 = aVLTree13.getBalance(node33);
    aVLTree13.delete((int)(short)10);
    aVLTree13.delete(100);
    AVLTree aVLTree40 = new AVLTree();
    AVLTree.Node node41 = null;
    int i42 = aVLTree40.getBalance(node41);
    AVLTree.Node node44 = aVLTree40.find((int)'4');
    aVLTree40.insert(0);
    aVLTree40.insert((int)(byte)10);
    AVLTree.Node node49 = aVLTree40.getRoot();
    int i50 = aVLTree13.getBalance(node49);
    int i51 = aVLTree13.height();
    aVLTree13.delete((int)(short)1);
    AVLTree aVLTree54 = new AVLTree();
    AVLTree.Node node55 = null;
    int i56 = aVLTree54.getBalance(node55);
    AVLTree.Node node58 = aVLTree54.find((int)'4');
    aVLTree54.insert(0);
    AVLTree.Node node61 = aVLTree54.getRoot();
    AVLTree.Node node62 = aVLTree54.getRoot();
    int i63 = aVLTree13.getBalance(node62);
    int i64 = aVLTree13.height();
    AVLTree aVLTree65 = new AVLTree();
    AVLTree.Node node66 = null;
    int i67 = aVLTree65.getBalance(node66);
    aVLTree65.insert(0);
    int i70 = aVLTree65.height();
    aVLTree65.delete((int)(byte)-1);
    AVLTree aVLTree73 = new AVLTree();
    AVLTree.Node node74 = null;
    int i75 = aVLTree73.getBalance(node74);
    AVLTree.Node node77 = aVLTree73.find((int)'4');
    aVLTree73.insert(0);
    AVLTree.Node node80 = aVLTree73.getRoot();
    int i81 = aVLTree65.getBalance(node80);
    AVLTree.Node node83 = aVLTree65.find((int)(short)0);
    int i84 = aVLTree13.getBalance(node83);
    AVLTree.Node node86 = aVLTree13.find((int)(short)10);
    AVLTree aVLTree87 = new AVLTree();
    aVLTree87.insert(0);
    AVLTree.Node node91 = aVLTree87.find(100);
    AVLTree.Node node92 = aVLTree87.getRoot();
    int i93 = aVLTree13.getBalance(node92);
    int i94 = aVLTree0.getBalance(node92);
    AVLTree.Node node96 = aVLTree0.find((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node96);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)' ');
    AVLTree.Node node13 = aVLTree0.find((int)(short)1);
    aVLTree0.insert((int)(short)10);
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node18 = aVLTree0.getRoot();
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    aVLTree19.insert(0);
    int i24 = aVLTree19.height();
    aVLTree19.delete((int)(byte)-1);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree19.getBalance(node34);
    AVLTree.Node node36 = aVLTree19.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    AVLTree.Node node39 = aVLTree0.find(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(byte)-1);
    aVLTree13.delete((int)(byte)10);
    AVLTree.Node node26 = aVLTree13.find((int)(short)0);
    int i27 = aVLTree0.getBalance(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert(10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.getRoot();
    int i34 = aVLTree25.height();
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    AVLTree.Node node45 = aVLTree38.getRoot();
    int i46 = aVLTree35.getBalance(node45);
    int i47 = aVLTree25.getBalance(node45);
    aVLTree25.delete((int)(short)10);
    aVLTree25.delete(100);
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    AVLTree.Node node56 = aVLTree52.find((int)'4');
    aVLTree52.insert(0);
    aVLTree52.insert((int)(byte)10);
    AVLTree.Node node61 = aVLTree52.getRoot();
    int i62 = aVLTree25.getBalance(node61);
    int i63 = aVLTree25.height();
    aVLTree25.delete((int)(short)1);
    AVLTree aVLTree66 = new AVLTree();
    AVLTree.Node node67 = null;
    int i68 = aVLTree66.getBalance(node67);
    AVLTree.Node node70 = aVLTree66.find((int)'4');
    aVLTree66.insert(0);
    AVLTree.Node node73 = aVLTree66.getRoot();
    AVLTree.Node node74 = aVLTree66.getRoot();
    int i75 = aVLTree25.getBalance(node74);
    int i76 = aVLTree25.height();
    AVLTree aVLTree77 = new AVLTree();
    AVLTree.Node node78 = null;
    int i79 = aVLTree77.getBalance(node78);
    aVLTree77.insert(0);
    int i82 = aVLTree77.height();
    aVLTree77.delete((int)(byte)-1);
    AVLTree aVLTree85 = new AVLTree();
    AVLTree.Node node86 = null;
    int i87 = aVLTree85.getBalance(node86);
    AVLTree.Node node89 = aVLTree85.find((int)'4');
    aVLTree85.insert(0);
    AVLTree.Node node92 = aVLTree85.getRoot();
    int i93 = aVLTree77.getBalance(node92);
    AVLTree.Node node95 = aVLTree77.find((int)(short)0);
    int i96 = aVLTree25.getBalance(node95);
    int i97 = aVLTree0.getBalance(node95);
    AVLTree.Node node99 = aVLTree0.find((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node99);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    aVLTree11.insert(0);
    int i16 = aVLTree11.height();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    aVLTree17.insert((int)(byte)10);
    AVLTree.Node node27 = aVLTree17.find((int)(short)1);
    AVLTree.Node node29 = aVLTree17.find((int)(byte)100);
    int i30 = aVLTree17.height();
    AVLTree.Node node31 = aVLTree17.getRoot();
    int i32 = aVLTree11.getBalance(node31);
    int i33 = aVLTree0.getBalance(node31);
    int i34 = aVLTree0.height();
    int i35 = aVLTree0.height();
    AVLTree aVLTree36 = new AVLTree();
    aVLTree36.insert(0);
    AVLTree.Node node40 = aVLTree36.find(100);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    aVLTree41.insert(0);
    int i46 = aVLTree41.height();
    aVLTree41.delete((int)(byte)-1);
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    AVLTree.Node node56 = aVLTree49.getRoot();
    int i57 = aVLTree41.getBalance(node56);
    int i58 = aVLTree36.getBalance(node56);
    aVLTree36.insert((int)(short)-1);
    aVLTree36.delete((int)'4');
    AVLTree.Node node64 = aVLTree36.find(100);
    aVLTree36.insert((int)(byte)10);
    AVLTree.Node node68 = aVLTree36.find((int)(short)1);
    aVLTree36.insert(2);
    AVLTree.Node node71 = aVLTree36.getRoot();
    int i72 = aVLTree0.getBalance(node71);
    aVLTree0.delete((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.find((int)(byte)0);
    AVLTree.Node node14 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(100);
    AVLTree.Node node10 = aVLTree0.getRoot();
    int i11 = aVLTree0.height();
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    AVLTree.Node node15 = aVLTree0.find((int)(short)1);
    int i16 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node50 = aVLTree0.find(100);
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    AVLTree.Node node58 = aVLTree51.getRoot();
    int i59 = aVLTree51.height();
    AVLTree aVLTree60 = new AVLTree();
    AVLTree.Node node61 = null;
    int i62 = aVLTree60.getBalance(node61);
    AVLTree aVLTree63 = new AVLTree();
    AVLTree.Node node64 = null;
    int i65 = aVLTree63.getBalance(node64);
    AVLTree.Node node67 = aVLTree63.find((int)'4');
    aVLTree63.insert(0);
    AVLTree.Node node70 = aVLTree63.getRoot();
    int i71 = aVLTree60.getBalance(node70);
    int i72 = aVLTree51.getBalance(node70);
    int i73 = aVLTree51.height();
    AVLTree.Node node74 = aVLTree51.getRoot();
    int i75 = aVLTree0.getBalance(node74);
    AVLTree.Node node76 = aVLTree0.getRoot();
    AVLTree.Node node77 = null;
    int i78 = aVLTree0.getBalance(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    AVLTree.Node node15 = aVLTree0.find(0);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree.Node node18 = aVLTree0.find((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    aVLTree0.delete((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)0);
    int i24 = aVLTree0.height();
    aVLTree0.delete(0);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node6 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)' ');
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree.Node node14 = aVLTree10.find((int)'4');
    aVLTree10.insert(0);
    aVLTree10.insert((int)(byte)10);
    AVLTree.Node node20 = aVLTree10.find((int)(short)1);
    AVLTree.Node node22 = aVLTree10.find((int)(byte)100);
    int i23 = aVLTree10.height();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    int i33 = aVLTree24.getBalance(node32);
    int i34 = aVLTree10.getBalance(node32);
    int i35 = aVLTree0.getBalance(node32);
    AVLTree.Node node37 = aVLTree0.find(0);
    aVLTree0.insert(2);
    AVLTree.Node node40 = aVLTree0.getRoot();
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    aVLTree41.insert(0);
    int i46 = aVLTree41.height();
    aVLTree41.delete((int)(byte)1);
    aVLTree41.delete(100);
    AVLTree.Node node51 = aVLTree41.getRoot();
    aVLTree41.delete((int)(short)100);
    aVLTree41.delete(1);
    aVLTree41.delete((int)(byte)100);
    AVLTree.Node node58 = aVLTree41.getRoot();
    int i59 = aVLTree0.getBalance(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    AVLTree.Node node20 = aVLTree0.find((int)'4');
    aVLTree0.insert((int)'4');
    aVLTree0.delete(1);
    AVLTree.Node node25 = aVLTree0.getRoot();
    AVLTree.Node node26 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(100);
    AVLTree.Node node10 = aVLTree0.getRoot();
    int i11 = aVLTree0.height();
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)-1);
    int i15 = aVLTree0.height();
    int i16 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    int i6 = aVLTree0.height();
    aVLTree0.insert((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    int i11 = aVLTree0.height();
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree12.height();
    AVLTree.Node node22 = aVLTree12.getRoot();
    int i23 = aVLTree12.height();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree.Node node28 = aVLTree24.find((int)'4');
    aVLTree24.insert(0);
    aVLTree24.insert((int)(byte)10);
    AVLTree.Node node33 = aVLTree24.getRoot();
    aVLTree24.insert((int)(short)100);
    AVLTree.Node node37 = aVLTree24.find((int)'a');
    AVLTree.Node node38 = aVLTree24.getRoot();
    AVLTree.Node node39 = aVLTree24.getRoot();
    aVLTree24.delete(1);
    AVLTree.Node node42 = aVLTree24.getRoot();
    int i43 = aVLTree12.getBalance(node42);
    int i44 = aVLTree0.getBalance(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    int i27 = aVLTree0.height();
    AVLTree aVLTree28 = new AVLTree();
    aVLTree28.insert(0);
    AVLTree.Node node32 = aVLTree28.find(100);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    aVLTree33.insert(0);
    int i38 = aVLTree33.height();
    aVLTree33.delete((int)(byte)-1);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    int i49 = aVLTree33.getBalance(node48);
    int i50 = aVLTree28.getBalance(node48);
    aVLTree28.insert((int)(short)-1);
    aVLTree28.delete((int)'4');
    aVLTree28.delete((int)' ');
    AVLTree.Node node58 = aVLTree28.find((int)(byte)0);
    int i59 = aVLTree0.getBalance(node58);
    AVLTree.Node node60 = aVLTree0.getRoot();
    AVLTree.Node node62 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert(10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    int i23 = aVLTree0.height();
    int i24 = aVLTree0.height();
    AVLTree.Node node25 = aVLTree0.getRoot();
    int i26 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node19 = aVLTree0.find((int)(short)100);
    aVLTree0.delete(0);
    aVLTree0.delete((int)(short)-1);
    AVLTree.Node node25 = aVLTree0.find((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    int i11 = aVLTree0.height();
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    aVLTree27.insert((int)(byte)10);
    AVLTree.Node node37 = aVLTree27.find((int)(short)1);
    AVLTree.Node node39 = aVLTree27.find((int)(byte)100);
    AVLTree.Node node40 = aVLTree27.getRoot();
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    AVLTree.Node node48 = aVLTree44.find((int)'4');
    aVLTree44.insert(0);
    AVLTree.Node node51 = aVLTree44.getRoot();
    int i52 = aVLTree41.getBalance(node51);
    int i53 = aVLTree27.getBalance(node51);
    int i54 = aVLTree27.height();
    aVLTree27.delete((int)(short)1);
    aVLTree27.insert((int)(byte)100);
    AVLTree.Node node60 = aVLTree27.find((int)' ');
    AVLTree.Node node61 = aVLTree27.getRoot();
    int i62 = aVLTree0.getBalance(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    int i14 = aVLTree0.height();
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree.Node node17 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    int i9 = aVLTree0.height();
    aVLTree0.insert(10);
    AVLTree.Node node13 = aVLTree0.find((int)(byte)1);
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    AVLTree.Node node21 = aVLTree14.getRoot();
    int i22 = aVLTree14.height();
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    int i34 = aVLTree23.getBalance(node33);
    int i35 = aVLTree14.getBalance(node33);
    aVLTree14.delete((int)(byte)0);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    aVLTree38.insert((int)(byte)10);
    AVLTree.Node node47 = aVLTree38.getRoot();
    aVLTree38.insert((int)(short)100);
    AVLTree.Node node51 = aVLTree38.find((int)'a');
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    aVLTree52.insert(0);
    AVLTree.Node node57 = aVLTree52.getRoot();
    AVLTree.Node node58 = aVLTree52.getRoot();
    AVLTree.Node node60 = aVLTree52.find((int)(short)10);
    AVLTree.Node node61 = aVLTree52.getRoot();
    int i62 = aVLTree52.height();
    AVLTree.Node node63 = aVLTree52.getRoot();
    int i64 = aVLTree38.getBalance(node63);
    int i65 = aVLTree14.getBalance(node63);
    int i66 = aVLTree0.getBalance(node63);
    int i67 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find(2);
    int i17 = aVLTree0.height();
    AVLTree.Node node19 = aVLTree0.find(0);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    aVLTree20.insert(0);
    AVLTree.Node node25 = aVLTree20.getRoot();
    aVLTree20.delete((int)(byte)100);
    aVLTree20.delete((int)(short)10);
    AVLTree.Node node31 = aVLTree20.find((int)(short)-1);
    AVLTree.Node node32 = aVLTree20.getRoot();
    int i33 = aVLTree0.getBalance(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)'#');
    aVLTree0.insert(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete(100);
    AVLTree.Node node25 = aVLTree0.getRoot();
    AVLTree.Node node26 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)-1);
    int i29 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node26 = aVLTree0.find(10);
    aVLTree0.insert((int)' ');
    AVLTree.Node node30 = aVLTree0.find((int)(short)100);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    AVLTree.Node node42 = aVLTree31.find((int)'#');
    AVLTree.Node node44 = aVLTree31.find((int)(byte)-1);
    aVLTree31.delete(100);
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    aVLTree47.insert(0);
    AVLTree.Node node52 = aVLTree47.getRoot();
    AVLTree.Node node53 = aVLTree47.getRoot();
    int i54 = aVLTree31.getBalance(node53);
    AVLTree aVLTree55 = new AVLTree();
    AVLTree.Node node56 = null;
    int i57 = aVLTree55.getBalance(node56);
    AVLTree.Node node59 = aVLTree55.find((int)'4');
    aVLTree55.insert(0);
    int i62 = aVLTree55.height();
    AVLTree.Node node64 = aVLTree55.find((int)(short)-1);
    AVLTree.Node node66 = aVLTree55.find((int)' ');
    AVLTree.Node node68 = aVLTree55.find((int)(short)1);
    aVLTree55.insert((int)(short)10);
    aVLTree55.delete((int)(byte)100);
    AVLTree.Node node73 = aVLTree55.getRoot();
    int i74 = aVLTree31.getBalance(node73);
    int i75 = aVLTree0.getBalance(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    AVLTree.Node node35 = aVLTree27.getRoot();
    int i36 = aVLTree27.height();
    AVLTree aVLTree37 = new AVLTree();
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    AVLTree.Node node45 = aVLTree38.getRoot();
    int i46 = aVLTree37.getBalance(node45);
    int i47 = aVLTree27.getBalance(node45);
    int i48 = aVLTree0.getBalance(node45);
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    int i56 = aVLTree49.height();
    AVLTree.Node node58 = aVLTree49.find((int)(short)-1);
    aVLTree49.insert((int)' ');
    AVLTree.Node node61 = aVLTree49.getRoot();
    int i62 = aVLTree0.getBalance(node61);
    AVLTree aVLTree63 = new AVLTree();
    aVLTree63.insert(0);
    int i66 = aVLTree63.height();
    int i67 = aVLTree63.height();
    AVLTree.Node node69 = aVLTree63.find((int)(short)1);
    AVLTree aVLTree70 = new AVLTree();
    AVLTree.Node node71 = null;
    int i72 = aVLTree70.getBalance(node71);
    aVLTree70.insert(0);
    int i75 = aVLTree70.height();
    AVLTree.Node node77 = aVLTree70.find((int)(short)0);
    int i78 = aVLTree63.getBalance(node77);
    int i79 = aVLTree0.getBalance(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    int i13 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    aVLTree16.delete((int)(byte)100);
    aVLTree16.delete((int)(short)10);
    aVLTree16.delete((int)(byte)0);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    aVLTree28.insert(0);
    int i33 = aVLTree28.height();
    AVLTree.Node node35 = aVLTree28.find((int)(short)0);
    int i36 = aVLTree16.getBalance(node35);
    int i37 = aVLTree0.getBalance(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    aVLTree0.delete((int)' ');
    aVLTree0.delete((-1));
    aVLTree0.delete(1);
    aVLTree0.delete((int)(short)0);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    int i33 = aVLTree25.height();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    aVLTree34.insert(0);
    AVLTree.Node node39 = aVLTree34.getRoot();
    AVLTree.Node node40 = aVLTree34.getRoot();
    int i41 = aVLTree25.getBalance(node40);
    AVLTree aVLTree42 = new AVLTree();
    AVLTree.Node node43 = null;
    int i44 = aVLTree42.getBalance(node43);
    AVLTree.Node node46 = aVLTree42.find((int)'4');
    aVLTree42.insert(0);
    AVLTree.Node node49 = aVLTree42.getRoot();
    int i50 = aVLTree42.height();
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    aVLTree51.insert(0);
    AVLTree.Node node56 = aVLTree51.getRoot();
    AVLTree.Node node57 = aVLTree51.getRoot();
    int i58 = aVLTree42.getBalance(node57);
    int i59 = aVLTree25.getBalance(node57);
    int i60 = aVLTree0.getBalance(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    AVLTree.Node node10 = aVLTree6.find((int)'4');
    aVLTree6.insert(0);
    AVLTree.Node node13 = aVLTree6.getRoot();
    AVLTree.Node node14 = aVLTree6.getRoot();
    aVLTree6.insert((int)(byte)1);
    aVLTree6.delete(100);
    AVLTree.Node node19 = aVLTree6.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    int i24 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    AVLTree.Node node24 = aVLTree13.find((int)'#');
    int i25 = aVLTree13.height();
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    aVLTree28.insert((int)(short)1);
    AVLTree.Node node40 = aVLTree28.getRoot();
    aVLTree28.delete((int)(byte)0);
    AVLTree.Node node43 = aVLTree28.getRoot();
    int i44 = aVLTree0.getBalance(node43);
    AVLTree.Node node45 = aVLTree0.getRoot();
    int i46 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node13 = aVLTree0.find((int)'a');
    AVLTree.Node node14 = aVLTree0.getRoot();
    int i15 = aVLTree0.height();
    aVLTree0.delete(10);
    int i18 = aVLTree0.height();
    AVLTree.Node node20 = aVLTree0.find((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(10);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    int i15 = aVLTree8.height();
    AVLTree.Node node17 = aVLTree8.find((int)(short)-1);
    AVLTree.Node node19 = aVLTree8.find((int)'#');
    AVLTree.Node node21 = aVLTree8.find((int)(byte)-1);
    aVLTree8.delete(100);
    AVLTree.Node node24 = aVLTree8.getRoot();
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    AVLTree.Node node35 = aVLTree28.getRoot();
    int i36 = aVLTree25.getBalance(node35);
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    AVLTree.Node node44 = aVLTree37.getRoot();
    AVLTree.Node node45 = aVLTree37.getRoot();
    int i46 = aVLTree25.getBalance(node45);
    aVLTree25.insert(1);
    aVLTree25.delete((int)(short)-1);
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    AVLTree.Node node58 = aVLTree51.getRoot();
    AVLTree.Node node59 = aVLTree51.getRoot();
    int i60 = aVLTree51.height();
    AVLTree.Node node61 = aVLTree51.getRoot();
    AVLTree.Node node62 = aVLTree51.getRoot();
    int i63 = aVLTree25.getBalance(node62);
    int i64 = aVLTree8.getBalance(node62);
    aVLTree8.insert((int)'a');
    AVLTree.Node node68 = aVLTree8.find((-1));
    AVLTree.Node node70 = aVLTree8.find(0);
    int i71 = aVLTree0.getBalance(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    aVLTree0.delete((int)(byte)100);
    aVLTree0.insert((int)(byte)-1);
    AVLTree.Node node22 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node24 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    int i27 = aVLTree0.height();
    aVLTree0.insert((int)(short)-1);
    aVLTree0.insert((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)(short)10);
    AVLTree.Node node35 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node38 = aVLTree0.getRoot();
    AVLTree.Node node39 = aVLTree0.getRoot();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)'#');
    aVLTree0.delete(0);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(2);
    int i11 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    AVLTree.Node node18 = aVLTree0.find((int)(byte)10);
    AVLTree.Node node20 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((-1));
    aVLTree0.delete((int)'4');
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.find((int)(short)10);
    aVLTree25.insert((int)(byte)1);
    AVLTree.Node node36 = aVLTree25.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    aVLTree0.insert((int)'a');
    aVLTree0.insert((int)(byte)100);
    aVLTree0.delete((int)(byte)0);
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    AVLTree.Node node23 = aVLTree19.find((int)'4');
    AVLTree.Node node25 = aVLTree19.find(10);
    aVLTree19.delete(10);
    int i28 = aVLTree19.height();
    int i29 = aVLTree19.height();
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    int i37 = aVLTree30.height();
    AVLTree.Node node39 = aVLTree30.find((int)(short)-1);
    AVLTree.Node node41 = aVLTree30.find((int)'#');
    AVLTree.Node node43 = aVLTree30.find((int)(byte)-1);
    aVLTree30.delete(100);
    AVLTree.Node node46 = aVLTree30.getRoot();
    int i47 = aVLTree19.getBalance(node46);
    int i48 = aVLTree0.getBalance(node46);
    aVLTree0.delete(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    AVLTree.Node node18 = aVLTree0.find(1);
    aVLTree0.delete((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(10);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    AVLTree.Node node16 = aVLTree9.getRoot();
    int i17 = aVLTree9.height();
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    AVLTree.Node node25 = aVLTree21.find((int)'4');
    aVLTree21.insert(0);
    AVLTree.Node node28 = aVLTree21.getRoot();
    int i29 = aVLTree18.getBalance(node28);
    int i30 = aVLTree9.getBalance(node28);
    aVLTree9.delete((int)(byte)0);
    int i33 = aVLTree9.height();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    aVLTree34.insert(0);
    int i39 = aVLTree34.height();
    AVLTree aVLTree40 = new AVLTree();
    AVLTree.Node node41 = null;
    int i42 = aVLTree40.getBalance(node41);
    AVLTree.Node node44 = aVLTree40.find((int)'4');
    aVLTree40.insert(0);
    aVLTree40.insert((int)(byte)10);
    AVLTree.Node node50 = aVLTree40.find((int)(short)1);
    AVLTree.Node node52 = aVLTree40.find((int)(byte)100);
    int i53 = aVLTree40.height();
    AVLTree.Node node54 = aVLTree40.getRoot();
    int i55 = aVLTree34.getBalance(node54);
    int i56 = aVLTree9.getBalance(node54);
    int i57 = aVLTree0.getBalance(node54);
    aVLTree0.delete((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)1);
    AVLTree.Node node16 = aVLTree0.find((int)(byte)0);
    aVLTree0.delete((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    aVLTree0.delete((int)(short)-1);
    int i26 = aVLTree0.height();
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    int i34 = aVLTree27.height();
    AVLTree.Node node36 = aVLTree27.find((int)(short)-1);
    AVLTree.Node node38 = aVLTree27.find((int)'#');
    AVLTree.Node node40 = aVLTree27.find((int)(byte)-1);
    aVLTree27.insert((int)(short)100);
    aVLTree27.delete(0);
    int i45 = aVLTree27.height();
    aVLTree27.delete((int)(byte)10);
    AVLTree.Node node48 = aVLTree27.getRoot();
    AVLTree.Node node49 = aVLTree27.getRoot();
    int i50 = aVLTree0.getBalance(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node50 = aVLTree0.find(100);
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    AVLTree.Node node58 = aVLTree51.getRoot();
    AVLTree.Node node59 = aVLTree51.getRoot();
    int i60 = aVLTree51.height();
    AVLTree.Node node61 = aVLTree51.getRoot();
    AVLTree.Node node62 = aVLTree51.getRoot();
    int i63 = aVLTree0.getBalance(node62);
    AVLTree.Node node64 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node6 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)' ');
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree.Node node14 = aVLTree10.find((int)'4');
    aVLTree10.insert(0);
    aVLTree10.insert((int)(byte)10);
    AVLTree.Node node20 = aVLTree10.find((int)(short)1);
    AVLTree.Node node22 = aVLTree10.find((int)(byte)100);
    int i23 = aVLTree10.height();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    int i33 = aVLTree24.getBalance(node32);
    int i34 = aVLTree10.getBalance(node32);
    int i35 = aVLTree0.getBalance(node32);
    aVLTree0.delete((int)' ');
    AVLTree aVLTree38 = new AVLTree();
    aVLTree38.insert(0);
    AVLTree.Node node41 = aVLTree38.getRoot();
    int i42 = aVLTree38.height();
    int i43 = aVLTree38.height();
    AVLTree.Node node45 = aVLTree38.find(100);
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    AVLTree.Node node50 = aVLTree46.find((int)'4');
    aVLTree46.insert(0);
    int i53 = aVLTree46.height();
    AVLTree.Node node55 = aVLTree46.find((int)(short)-1);
    AVLTree.Node node57 = aVLTree46.find((int)'#');
    AVLTree.Node node59 = aVLTree46.find((int)(byte)-1);
    aVLTree46.insert((int)(short)100);
    int i62 = aVLTree46.height();
    AVLTree.Node node63 = aVLTree46.getRoot();
    aVLTree46.delete(100);
    AVLTree.Node node66 = aVLTree46.getRoot();
    int i67 = aVLTree38.getBalance(node66);
    int i68 = aVLTree0.getBalance(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.insert((int)(byte)10);
    aVLTree0.insert((int)'#');
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    aVLTree10.insert(0);
    int i15 = aVLTree10.height();
    aVLTree10.delete((int)(byte)-1);
    aVLTree10.delete((int)(short)0);
    int i20 = aVLTree10.height();
    aVLTree10.insert((int)(byte)-1);
    aVLTree10.delete((int)(short)0);
    aVLTree10.delete((int)' ');
    AVLTree.Node node28 = aVLTree10.find(1);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    aVLTree29.insert(0);
    AVLTree.Node node34 = aVLTree29.getRoot();
    AVLTree.Node node35 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.find((int)(short)10);
    AVLTree.Node node38 = aVLTree29.getRoot();
    int i39 = aVLTree10.getBalance(node38);
    aVLTree10.delete((int)(byte)100);
    AVLTree.Node node42 = aVLTree10.getRoot();
    int i43 = aVLTree0.getBalance(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    int i29 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    int i32 = aVLTree0.height();
    int i33 = aVLTree0.height();
    AVLTree.Node node34 = aVLTree0.getRoot();
    AVLTree.Node node36 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    int i14 = aVLTree0.height();
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree.Node node17 = aVLTree0.find((int)(byte)10);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(short)-1);
    AVLTree.Node node29 = aVLTree18.find((int)'#');
    AVLTree.Node node30 = aVLTree18.getRoot();
    int i31 = aVLTree18.height();
    aVLTree18.delete(2);
    AVLTree.Node node34 = aVLTree18.getRoot();
    AVLTree.Node node35 = aVLTree18.getRoot();
    int i36 = aVLTree0.getBalance(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    int i28 = aVLTree23.height();
    aVLTree23.delete((int)(byte)-1);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree23.getBalance(node38);
    int i40 = aVLTree0.getBalance(node38);
    int i41 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node45 = aVLTree0.find((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)-1);
    int i16 = aVLTree0.height();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    int i24 = aVLTree17.height();
    AVLTree.Node node26 = aVLTree17.find((int)(short)-1);
    AVLTree.Node node28 = aVLTree17.find((int)'#');
    aVLTree17.delete((int)(byte)0);
    AVLTree.Node node32 = aVLTree17.find((int)(short)0);
    aVLTree17.insert(100);
    AVLTree.Node node36 = aVLTree17.find((int)(byte)100);
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree aVLTree1 = new AVLTree();
    AVLTree.Node node2 = null;
    int i3 = aVLTree1.getBalance(node2);
    AVLTree.Node node5 = aVLTree1.find((int)'4');
    aVLTree1.insert(0);
    AVLTree.Node node8 = aVLTree1.getRoot();
    int i9 = aVLTree0.getBalance(node8);
    int i10 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node13 = aVLTree0.find((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node16 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)10);
    AVLTree aVLTree19 = new AVLTree();
    aVLTree19.delete((int)(short)1);
    AVLTree.Node node23 = aVLTree19.find((int)(byte)0);
    int i24 = aVLTree19.height();
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.getRoot();
    aVLTree25.insert((int)(byte)1);
    aVLTree25.delete(100);
    AVLTree.Node node38 = aVLTree25.getRoot();
    int i39 = aVLTree19.getBalance(node38);
    int i40 = aVLTree0.getBalance(node38);
    AVLTree.Node node42 = aVLTree0.find((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    aVLTree12.insert(0);
    AVLTree.Node node17 = aVLTree12.getRoot();
    AVLTree.Node node18 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.find((int)(short)10);
    aVLTree12.insert((int)(byte)1);
    AVLTree.Node node23 = aVLTree12.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    aVLTree0.delete((int)'#');
    AVLTree.Node node28 = aVLTree0.find((int)(short)1);
    AVLTree.Node node29 = aVLTree0.getRoot();
    AVLTree.Node node31 = aVLTree0.find(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    int i11 = aVLTree0.height();
    aVLTree0.insert((int)'a');
    int i14 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node17 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    int i27 = aVLTree0.height();
    AVLTree.Node node28 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    aVLTree0.delete((int)' ');
    aVLTree0.insert((int)(byte)100);
    AVLTree.Node node22 = aVLTree0.find((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    AVLTree.Node node28 = aVLTree0.find(100);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node32 = aVLTree0.find((int)(short)1);
    aVLTree0.insert(2);
    AVLTree.Node node35 = aVLTree0.getRoot();
    int i36 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete(2);
    aVLTree0.insert((int)'#');
    AVLTree.Node node29 = aVLTree0.find((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    AVLTree.Node node5 = aVLTree0.find(1);
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    AVLTree.Node node10 = aVLTree6.find((int)'4');
    aVLTree6.insert(0);
    aVLTree6.insert((int)(byte)10);
    AVLTree.Node node15 = aVLTree6.getRoot();
    aVLTree6.delete((int)'a');
    aVLTree6.insert((-1));
    aVLTree6.delete((int)(byte)0);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    aVLTree22.insert(0);
    int i27 = aVLTree22.height();
    AVLTree.Node node28 = aVLTree22.getRoot();
    AVLTree.Node node29 = aVLTree22.getRoot();
    int i30 = aVLTree6.getBalance(node29);
    int i31 = aVLTree0.getBalance(node29);
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    aVLTree32.insert(0);
    int i37 = aVLTree32.height();
    aVLTree32.delete((int)(byte)-1);
    aVLTree32.delete((int)(short)0);
    int i42 = aVLTree32.height();
    aVLTree32.insert((int)(byte)-1);
    aVLTree32.delete((int)(short)0);
    aVLTree32.delete((int)' ');
    AVLTree.Node node50 = aVLTree32.find(1);
    AVLTree.Node node51 = aVLTree32.getRoot();
    AVLTree.Node node52 = aVLTree32.getRoot();
    int i53 = aVLTree0.getBalance(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.delete((int)(short)10);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node15 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(2);
    AVLTree.Node node12 = aVLTree0.find((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    aVLTree6.insert(0);
    AVLTree.Node node11 = aVLTree6.getRoot();
    AVLTree.Node node12 = aVLTree6.getRoot();
    AVLTree.Node node14 = aVLTree6.find((int)(short)10);
    AVLTree.Node node15 = aVLTree6.getRoot();
    AVLTree.Node node16 = aVLTree6.getRoot();
    int i17 = aVLTree0.getBalance(node16);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    aVLTree18.insert(0);
    int i23 = aVLTree18.height();
    aVLTree18.delete((int)(byte)-1);
    int i26 = aVLTree18.height();
    aVLTree18.delete((int)(short)1);
    int i29 = aVLTree18.height();
    aVLTree18.insert((int)'a');
    int i32 = aVLTree18.height();
    AVLTree.Node node34 = aVLTree18.find(100);
    AVLTree.Node node35 = aVLTree18.getRoot();
    int i36 = aVLTree0.getBalance(node35);
    AVLTree.Node node38 = aVLTree0.find((int)(byte)1);
    aVLTree0.insert((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    AVLTree.Node node20 = aVLTree0.find((int)'4');
    int i21 = aVLTree0.height();
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    AVLTree.Node node26 = aVLTree22.find((int)'4');
    aVLTree22.insert(0);
    int i29 = aVLTree22.height();
    AVLTree.Node node31 = aVLTree22.find((int)(short)-1);
    AVLTree.Node node33 = aVLTree22.find((int)'#');
    AVLTree.Node node35 = aVLTree22.find((int)(byte)-1);
    aVLTree22.delete(100);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    aVLTree38.insert(0);
    AVLTree.Node node43 = aVLTree38.getRoot();
    AVLTree.Node node44 = aVLTree38.getRoot();
    int i45 = aVLTree22.getBalance(node44);
    AVLTree.Node node47 = aVLTree22.find((int)(short)0);
    int i48 = aVLTree0.getBalance(node47);
    aVLTree0.delete(2);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    int i23 = aVLTree0.height();
    aVLTree0.insert(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node7 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node9 = aVLTree0.find((int)(byte)0);
    AVLTree.Node node10 = aVLTree0.getRoot();
    aVLTree0.insert(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    AVLTree.Node node6 = aVLTree0.find(10);
    aVLTree0.delete(10);
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    int i18 = aVLTree11.height();
    AVLTree.Node node20 = aVLTree11.find((int)(short)-1);
    AVLTree.Node node22 = aVLTree11.find((int)'#');
    AVLTree.Node node24 = aVLTree11.find((int)(byte)-1);
    aVLTree11.delete(100);
    AVLTree.Node node27 = aVLTree11.getRoot();
    int i28 = aVLTree0.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    int i36 = aVLTree29.height();
    AVLTree.Node node38 = aVLTree29.find((int)(short)-1);
    AVLTree.Node node40 = aVLTree29.find((int)'#');
    AVLTree.Node node42 = aVLTree29.find((int)(byte)-1);
    aVLTree29.insert((int)(short)100);
    int i45 = aVLTree29.height();
    aVLTree29.delete((int)(short)-1);
    AVLTree.Node node48 = aVLTree29.getRoot();
    int i49 = aVLTree0.getBalance(node48);
    AVLTree.Node node51 = aVLTree0.find((int)(short)10);
    AVLTree.Node node52 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.delete(10);
    int i13 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    aVLTree0.insert(2);
    int i5 = aVLTree0.height();
    AVLTree aVLTree6 = new AVLTree();
    aVLTree6.insert(0);
    AVLTree.Node node10 = aVLTree6.find(100);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    aVLTree11.insert(0);
    int i16 = aVLTree11.height();
    aVLTree11.delete((int)(byte)-1);
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    AVLTree.Node node23 = aVLTree19.find((int)'4');
    aVLTree19.insert(0);
    AVLTree.Node node26 = aVLTree19.getRoot();
    int i27 = aVLTree11.getBalance(node26);
    int i28 = aVLTree6.getBalance(node26);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    int i36 = aVLTree29.height();
    AVLTree.Node node38 = aVLTree29.find((int)(short)-1);
    aVLTree29.insert((int)(short)1);
    AVLTree.Node node41 = aVLTree29.getRoot();
    int i42 = aVLTree6.getBalance(node41);
    int i43 = aVLTree0.getBalance(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    aVLTree0.insert(100);
    aVLTree0.delete(1);
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node20 = aVLTree0.find((-1));
    AVLTree.Node node22 = aVLTree0.find((int)(short)10);
    AVLTree.Node node23 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node25 = aVLTree0.find((int)(short)0);
    aVLTree0.delete((int)' ');
    AVLTree.Node node29 = aVLTree0.find((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete(100);
    int i25 = aVLTree0.height();
    AVLTree.Node node26 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    AVLTree.Node node11 = aVLTree0.find((int)(short)-1);
    aVLTree0.delete((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)'#');
    aVLTree0.delete((int)'a');
    AVLTree.Node node19 = aVLTree0.find((int)(byte)1);
    AVLTree aVLTree20 = new AVLTree();
    aVLTree20.insert(0);
    AVLTree.Node node23 = aVLTree20.getRoot();
    AVLTree.Node node24 = aVLTree20.getRoot();
    int i25 = aVLTree0.getBalance(node24);
    AVLTree.Node node27 = aVLTree0.find(2);
    int i28 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree11.height();
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    aVLTree20.insert(0);
    AVLTree.Node node25 = aVLTree20.getRoot();
    AVLTree.Node node26 = aVLTree20.getRoot();
    int i27 = aVLTree11.getBalance(node26);
    int i28 = aVLTree0.getBalance(node26);
    AVLTree.Node node29 = aVLTree0.getRoot();
    int i30 = aVLTree0.height();
    aVLTree0.delete((-1));
    aVLTree0.delete((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    aVLTree0.delete(0);
    AVLTree.Node node14 = aVLTree0.getRoot();
    int i15 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree.Node node18 = aVLTree0.find(2);
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    AVLTree.Node node26 = aVLTree22.find((int)'4');
    aVLTree22.insert(0);
    AVLTree.Node node29 = aVLTree22.getRoot();
    int i30 = aVLTree19.getBalance(node29);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    AVLTree.Node node39 = aVLTree31.getRoot();
    int i40 = aVLTree19.getBalance(node39);
    aVLTree19.insert(1);
    aVLTree19.delete((int)(short)-1);
    int i45 = aVLTree19.height();
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    AVLTree.Node node50 = aVLTree46.find((int)'4');
    aVLTree46.insert(0);
    AVLTree.Node node53 = aVLTree46.getRoot();
    AVLTree.Node node54 = aVLTree46.getRoot();
    aVLTree46.insert((int)(byte)1);
    AVLTree aVLTree57 = new AVLTree();
    AVLTree.Node node58 = null;
    int i59 = aVLTree57.getBalance(node58);
    aVLTree57.insert(0);
    int i62 = aVLTree57.height();
    aVLTree57.delete((int)(byte)-1);
    AVLTree aVLTree65 = new AVLTree();
    AVLTree.Node node66 = null;
    int i67 = aVLTree65.getBalance(node66);
    AVLTree.Node node69 = aVLTree65.find((int)'4');
    aVLTree65.insert(0);
    AVLTree.Node node72 = aVLTree65.getRoot();
    int i73 = aVLTree57.getBalance(node72);
    int i74 = aVLTree46.getBalance(node72);
    int i75 = aVLTree19.getBalance(node72);
    AVLTree.Node node76 = aVLTree19.getRoot();
    int i77 = aVLTree0.getBalance(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    int i6 = aVLTree0.height();
    AVLTree aVLTree7 = new AVLTree();
    AVLTree.Node node8 = null;
    int i9 = aVLTree7.getBalance(node8);
    aVLTree7.insert(0);
    AVLTree.Node node12 = aVLTree7.getRoot();
    int i13 = aVLTree0.getBalance(node12);
    aVLTree0.insert((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    aVLTree13.insert((int)(short)-1);
    AVLTree.Node node21 = aVLTree13.getRoot();
    AVLTree aVLTree22 = new AVLTree();
    aVLTree22.insert(0);
    AVLTree.Node node26 = aVLTree22.find(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    int i32 = aVLTree27.height();
    aVLTree27.delete((int)(byte)-1);
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    AVLTree.Node node39 = aVLTree35.find((int)'4');
    aVLTree35.insert(0);
    AVLTree.Node node42 = aVLTree35.getRoot();
    int i43 = aVLTree27.getBalance(node42);
    int i44 = aVLTree22.getBalance(node42);
    aVLTree22.insert((int)(short)-1);
    AVLTree.Node node48 = aVLTree22.find(10);
    aVLTree22.insert((int)' ');
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    AVLTree.Node node58 = aVLTree51.getRoot();
    AVLTree.Node node59 = aVLTree51.getRoot();
    int i60 = aVLTree22.getBalance(node59);
    int i61 = aVLTree13.getBalance(node59);
    int i62 = aVLTree0.getBalance(node59);
    aVLTree0.delete((int)'#');
    AVLTree.Node node66 = aVLTree0.find((-1));
    int i67 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node26 = aVLTree0.find(10);
    aVLTree0.insert((int)' ');
    int i29 = aVLTree0.height();
    int i30 = aVLTree0.height();
    int i31 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    int i33 = aVLTree25.height();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    AVLTree.Node node44 = aVLTree37.getRoot();
    int i45 = aVLTree34.getBalance(node44);
    int i46 = aVLTree25.getBalance(node44);
    int i47 = aVLTree0.getBalance(node44);
    AVLTree.Node node49 = aVLTree0.find(2);
    AVLTree.Node node51 = aVLTree0.find((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    int i11 = aVLTree0.height();
    int i12 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node16 = aVLTree0.find((-1));
    aVLTree0.insert(100);
    aVLTree0.insert(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    AVLTree.Node node11 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    AVLTree.Node node24 = aVLTree13.find((int)'#');
    int i25 = aVLTree13.height();
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    aVLTree0.delete((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    aVLTree0.insert((int)'a');
    AVLTree aVLTree59 = new AVLTree();
    aVLTree59.insert(0);
    AVLTree.Node node63 = aVLTree59.find((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    AVLTree.Node node71 = aVLTree67.find((int)'4');
    aVLTree67.insert(0);
    AVLTree.Node node74 = aVLTree67.getRoot();
    int i75 = aVLTree64.getBalance(node74);
    int i76 = aVLTree59.getBalance(node74);
    int i77 = aVLTree0.getBalance(node74);
    int i78 = aVLTree0.height();
    AVLTree.Node node80 = aVLTree0.find((int)(byte)0);
    int i81 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    aVLTree0.delete(0);
    int i18 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node21 = aVLTree0.getRoot();
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.insert(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node11 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree.Node node14 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    int i22 = aVLTree0.height();
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree.Node node28 = aVLTree24.find((int)'4');
    aVLTree24.insert(0);
    AVLTree.Node node31 = aVLTree24.getRoot();
    AVLTree.Node node32 = aVLTree24.getRoot();
    int i33 = aVLTree0.getBalance(node32);
    aVLTree0.insert((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    int i9 = aVLTree0.height();
    aVLTree0.delete(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node24 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    AVLTree.Node node27 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    AVLTree.Node node31 = aVLTree0.find((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.delete((int)'a');
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    int i18 = aVLTree13.height();
    aVLTree13.delete((int)(byte)-1);
    aVLTree13.insert((-1));
    AVLTree.Node node23 = aVLTree13.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    aVLTree0.insert((-1));
    aVLTree0.delete((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    aVLTree0.insert((int)(byte)-1);
    AVLTree.Node node30 = aVLTree0.find((int)(byte)100);
    aVLTree0.delete((int)'4');
    aVLTree0.insert(1);
    aVLTree0.delete((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    int i15 = aVLTree8.height();
    AVLTree.Node node17 = aVLTree8.find((int)(short)-1);
    AVLTree.Node node19 = aVLTree8.find((int)'#');
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    aVLTree20.insert(0);
    AVLTree.Node node25 = aVLTree20.getRoot();
    AVLTree.Node node26 = aVLTree20.getRoot();
    AVLTree.Node node28 = aVLTree20.find((int)(short)10);
    AVLTree.Node node29 = aVLTree20.getRoot();
    int i30 = aVLTree8.getBalance(node29);
    int i31 = aVLTree0.getBalance(node29);
    aVLTree0.insert((int)'a');
    AVLTree.Node node35 = aVLTree0.find(0);
    aVLTree0.insert((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    aVLTree10.insert(0);
    AVLTree.Node node14 = aVLTree10.find(100);
    AVLTree aVLTree15 = new AVLTree();
    AVLTree.Node node16 = null;
    int i17 = aVLTree15.getBalance(node16);
    aVLTree15.insert(0);
    int i20 = aVLTree15.height();
    aVLTree15.delete((int)(byte)-1);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree.Node node27 = aVLTree23.find((int)'4');
    aVLTree23.insert(0);
    AVLTree.Node node30 = aVLTree23.getRoot();
    int i31 = aVLTree15.getBalance(node30);
    int i32 = aVLTree10.getBalance(node30);
    aVLTree10.insert((int)(short)-1);
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    aVLTree35.insert(0);
    AVLTree.Node node40 = aVLTree35.getRoot();
    AVLTree.Node node41 = aVLTree35.getRoot();
    int i42 = aVLTree10.getBalance(node41);
    aVLTree10.insert((int)'#');
    AVLTree.Node node45 = aVLTree10.getRoot();
    AVLTree.Node node47 = aVLTree10.find(1);
    AVLTree.Node node49 = aVLTree10.find((int)(short)0);
    AVLTree.Node node50 = aVLTree10.getRoot();
    int i51 = aVLTree0.getBalance(node50);
    int i52 = aVLTree0.height();
    int i53 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node24 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    AVLTree.Node node27 = aVLTree0.getRoot();
    int i28 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node31 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)10);
    aVLTree0.insert((int)(short)0);
    AVLTree aVLTree36 = new AVLTree();
    aVLTree36.insert(0);
    AVLTree.Node node40 = aVLTree36.find(100);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    aVLTree41.insert(0);
    int i46 = aVLTree41.height();
    aVLTree41.delete((int)(byte)-1);
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    AVLTree.Node node56 = aVLTree49.getRoot();
    int i57 = aVLTree41.getBalance(node56);
    int i58 = aVLTree36.getBalance(node56);
    int i59 = aVLTree0.getBalance(node56);
    aVLTree0.insert((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    aVLTree0.delete((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    aVLTree0.delete(1);
    int i19 = aVLTree0.height();
    AVLTree.Node node21 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node50 = aVLTree0.find(100);
    int i51 = aVLTree0.height();
    AVLTree.Node node52 = aVLTree0.getRoot();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(100);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    aVLTree31.insert((int)(short)1);
    AVLTree.Node node43 = aVLTree31.getRoot();
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    aVLTree44.insert(0);
    AVLTree.Node node49 = aVLTree44.getRoot();
    int i50 = aVLTree31.getBalance(node49);
    aVLTree31.insert(10);
    AVLTree.Node node53 = aVLTree31.getRoot();
    int i54 = aVLTree0.getBalance(node53);
    aVLTree0.delete((int)'a');
    AVLTree.Node node57 = aVLTree0.getRoot();
    AVLTree.Node node59 = aVLTree0.find(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node59);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)'#');
    AVLTree.Node node35 = aVLTree0.getRoot();
    AVLTree.Node node37 = aVLTree0.find(1);
    int i38 = aVLTree0.height();
    AVLTree.Node node39 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    AVLTree.Node node19 = aVLTree0.getRoot();
    AVLTree.Node node21 = aVLTree0.find((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    aVLTree6.insert(0);
    AVLTree.Node node11 = aVLTree6.getRoot();
    AVLTree.Node node12 = aVLTree6.getRoot();
    AVLTree.Node node14 = aVLTree6.find((int)(short)10);
    AVLTree.Node node15 = aVLTree6.getRoot();
    AVLTree.Node node16 = aVLTree6.getRoot();
    int i17 = aVLTree0.getBalance(node16);
    int i18 = aVLTree0.height();
    AVLTree.Node node19 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    int i10 = aVLTree3.height();
    AVLTree.Node node12 = aVLTree3.find((int)(short)-1);
    AVLTree.Node node14 = aVLTree3.find((int)'#');
    AVLTree.Node node16 = aVLTree3.find((int)(byte)-1);
    aVLTree3.delete(100);
    AVLTree.Node node19 = aVLTree3.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    AVLTree.Node node22 = aVLTree0.find((int)(byte)10);
    aVLTree0.insert((int)(byte)100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    aVLTree25.insert((int)(byte)10);
    AVLTree.Node node34 = aVLTree25.getRoot();
    aVLTree25.insert((int)(short)100);
    AVLTree.Node node38 = aVLTree25.find((int)'a');
    AVLTree.Node node39 = aVLTree25.getRoot();
    AVLTree aVLTree40 = new AVLTree();
    AVLTree.Node node41 = null;
    int i42 = aVLTree40.getBalance(node41);
    AVLTree.Node node44 = aVLTree40.find((int)'4');
    aVLTree40.insert(0);
    AVLTree.Node node47 = aVLTree40.getRoot();
    AVLTree.Node node48 = aVLTree40.getRoot();
    aVLTree40.insert((int)(byte)1);
    AVLTree.Node node51 = aVLTree40.getRoot();
    int i52 = aVLTree25.getBalance(node51);
    int i53 = aVLTree0.getBalance(node51);
    int i54 = aVLTree0.height();
    AVLTree.Node node56 = aVLTree0.find((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node56);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node18 = aVLTree0.getRoot();
    aVLTree0.insert((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    AVLTree.Node node17 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)1);
    int i20 = aVLTree0.height();
    AVLTree.Node node21 = null;
    int i22 = aVLTree0.getBalance(node21);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree.Node node24 = aVLTree0.getRoot();
    int i25 = aVLTree0.height();
    aVLTree0.insert((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node13 = aVLTree0.find((int)'a');
    AVLTree.Node node14 = aVLTree0.getRoot();
    int i15 = aVLTree0.height();
    AVLTree.Node node17 = aVLTree0.find((int)'#');
    AVLTree.Node node18 = aVLTree0.getRoot();
    aVLTree0.insert(1);
    int i21 = aVLTree0.height();
    int i22 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    aVLTree9.insert(0);
    AVLTree.Node node14 = aVLTree9.getRoot();
    AVLTree.Node node15 = aVLTree9.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    int i17 = aVLTree0.height();
    int i18 = aVLTree0.height();
    int i19 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    AVLTree.Node node23 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)'#');
    AVLTree.Node node6 = aVLTree0.find(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree aVLTree1 = new AVLTree();
    AVLTree.Node node2 = null;
    int i3 = aVLTree1.getBalance(node2);
    AVLTree.Node node5 = aVLTree1.find((int)'4');
    aVLTree1.insert(0);
    AVLTree.Node node8 = aVLTree1.getRoot();
    int i9 = aVLTree0.getBalance(node8);
    AVLTree.Node node10 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.insert((int)'#');
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    AVLTree.Node node25 = aVLTree18.getRoot();
    AVLTree.Node node26 = aVLTree18.getRoot();
    int i27 = aVLTree18.height();
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree28.getBalance(node38);
    int i40 = aVLTree18.getBalance(node38);
    int i41 = aVLTree0.getBalance(node38);
    AVLTree.Node node43 = aVLTree0.find((int)(short)1);
    AVLTree.Node node44 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    aVLTree8.insert((int)(byte)10);
    AVLTree.Node node18 = aVLTree8.find((int)(short)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node25 = aVLTree0.find(0);
    int i26 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    aVLTree0.insert((int)(byte)10);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    aVLTree30.insert((int)(byte)10);
    AVLTree.Node node39 = aVLTree30.getRoot();
    aVLTree30.delete((int)'a');
    AVLTree.Node node42 = aVLTree30.getRoot();
    int i43 = aVLTree0.getBalance(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    aVLTree31.insert((int)(short)1);
    AVLTree.Node node43 = aVLTree31.getRoot();
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    aVLTree44.insert(0);
    AVLTree.Node node49 = aVLTree44.getRoot();
    int i50 = aVLTree31.getBalance(node49);
    aVLTree31.insert(10);
    AVLTree.Node node53 = aVLTree31.getRoot();
    int i54 = aVLTree0.getBalance(node53);
    aVLTree0.delete((int)'a');
    aVLTree0.insert(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)'#');
    aVLTree0.delete((int)'a');
    AVLTree.Node node18 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    int i17 = aVLTree0.height();
    AVLTree.Node node19 = aVLTree0.find(1);
    aVLTree0.delete(100);
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    aVLTree13.insert((int)(short)-1);
    AVLTree.Node node21 = aVLTree13.getRoot();
    AVLTree.Node node23 = aVLTree13.find((int)(short)0);
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree.Node node28 = aVLTree24.find((int)'4');
    aVLTree24.insert(0);
    AVLTree.Node node31 = aVLTree24.getRoot();
    AVLTree.Node node32 = aVLTree24.getRoot();
    int i33 = aVLTree24.height();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    AVLTree.Node node44 = aVLTree37.getRoot();
    int i45 = aVLTree34.getBalance(node44);
    int i46 = aVLTree24.getBalance(node44);
    aVLTree24.delete((int)(byte)1);
    AVLTree.Node node50 = aVLTree24.find((int)(short)-1);
    AVLTree.Node node52 = aVLTree24.find((int)(short)0);
    int i53 = aVLTree13.getBalance(node52);
    int i54 = aVLTree0.getBalance(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    aVLTree0.delete((int)' ');
    AVLTree.Node node29 = aVLTree0.getRoot();
    AVLTree.Node node30 = aVLTree0.getRoot();
    AVLTree.Node node32 = aVLTree0.find((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    AVLTree.Node node24 = aVLTree13.find((int)'#');
    int i25 = aVLTree13.height();
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    AVLTree.Node node39 = aVLTree28.find((int)'#');
    AVLTree.Node node40 = aVLTree28.getRoot();
    aVLTree28.delete((int)'4');
    AVLTree.Node node43 = aVLTree28.getRoot();
    int i44 = aVLTree0.getBalance(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    int i10 = aVLTree3.height();
    AVLTree.Node node12 = aVLTree3.find((int)(short)-1);
    AVLTree.Node node14 = aVLTree3.find((int)'#');
    AVLTree.Node node16 = aVLTree3.find((int)(byte)-1);
    aVLTree3.delete(100);
    AVLTree.Node node19 = aVLTree3.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    AVLTree.Node node22 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    aVLTree0.insert(2);
    aVLTree0.insert((int)'#');
    int i22 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree.Node node17 = aVLTree0.find((int)(short)-1);
    aVLTree0.delete(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find((int)'a');
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(10);
    aVLTree17.insert((int)(byte)-1);
    int i26 = aVLTree17.height();
    AVLTree.Node node27 = aVLTree17.getRoot();
    int i28 = aVLTree0.getBalance(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find((int)(byte)100);
    aVLTree0.delete(2);
    AVLTree.Node node19 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    AVLTree.Node node20 = aVLTree0.find((int)(byte)100);
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    AVLTree.Node node25 = aVLTree21.find((int)'4');
    aVLTree21.insert(0);
    int i28 = aVLTree21.height();
    AVLTree.Node node30 = aVLTree21.find((int)(short)-1);
    AVLTree.Node node32 = aVLTree21.find((int)'#');
    AVLTree.Node node34 = aVLTree21.find((int)(byte)-1);
    aVLTree21.delete(100);
    AVLTree.Node node37 = aVLTree21.getRoot();
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    int i49 = aVLTree38.getBalance(node48);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree.Node node54 = aVLTree50.find((int)'4');
    aVLTree50.insert(0);
    AVLTree.Node node57 = aVLTree50.getRoot();
    AVLTree.Node node58 = aVLTree50.getRoot();
    int i59 = aVLTree38.getBalance(node58);
    aVLTree38.insert(1);
    aVLTree38.delete((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree.Node node68 = aVLTree64.find((int)'4');
    aVLTree64.insert(0);
    AVLTree.Node node71 = aVLTree64.getRoot();
    AVLTree.Node node72 = aVLTree64.getRoot();
    int i73 = aVLTree64.height();
    AVLTree.Node node74 = aVLTree64.getRoot();
    AVLTree.Node node75 = aVLTree64.getRoot();
    int i76 = aVLTree38.getBalance(node75);
    int i77 = aVLTree21.getBalance(node75);
    AVLTree.Node node79 = aVLTree21.find((int)' ');
    AVLTree.Node node80 = aVLTree21.getRoot();
    int i81 = aVLTree0.getBalance(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.delete((int)'a');
    aVLTree0.insert((-1));
    aVLTree0.delete((int)(byte)0);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    int i21 = aVLTree16.height();
    AVLTree.Node node22 = aVLTree16.getRoot();
    AVLTree.Node node23 = aVLTree16.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    int i25 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(10);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(2);
    aVLTree0.delete((int)'a');
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    aVLTree8.insert((int)(byte)10);
    AVLTree.Node node18 = aVLTree8.find((int)(short)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    aVLTree24.insert(0);
    AVLTree.Node node29 = aVLTree24.getRoot();
    aVLTree24.insert((int)(short)-1);
    AVLTree.Node node32 = aVLTree24.getRoot();
    int i33 = aVLTree24.height();
    aVLTree24.delete((int)(short)-1);
    aVLTree24.delete((int)(short)1);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    int i45 = aVLTree38.height();
    AVLTree.Node node47 = aVLTree38.find((int)(short)-1);
    AVLTree.Node node49 = aVLTree38.find((int)'#');
    AVLTree.Node node51 = aVLTree38.find((int)(byte)-1);
    aVLTree38.delete(100);
    aVLTree38.delete((int)(byte)10);
    aVLTree38.insert((int)(short)10);
    aVLTree38.insert((int)(short)1);
    AVLTree.Node node61 = aVLTree38.find((int)'4');
    AVLTree.Node node63 = aVLTree38.find((int)(short)1);
    int i64 = aVLTree24.getBalance(node63);
    int i65 = aVLTree0.getBalance(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    AVLTree.Node node20 = aVLTree0.find((int)'4');
    aVLTree0.insert((int)'4');
    aVLTree0.delete(1);
    AVLTree.Node node25 = aVLTree0.getRoot();
    int i26 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node6 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)' ');
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    AVLTree.Node node12 = aVLTree0.find(100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    int i17 = aVLTree0.height();
    AVLTree.Node node19 = aVLTree0.find(1);
    aVLTree0.delete(100);
    AVLTree aVLTree22 = new AVLTree();
    aVLTree22.insert(0);
    AVLTree.Node node26 = aVLTree22.find(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    int i32 = aVLTree27.height();
    aVLTree27.delete((int)(byte)-1);
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    AVLTree.Node node39 = aVLTree35.find((int)'4');
    aVLTree35.insert(0);
    AVLTree.Node node42 = aVLTree35.getRoot();
    int i43 = aVLTree27.getBalance(node42);
    int i44 = aVLTree22.getBalance(node42);
    aVLTree22.insert((int)(short)-1);
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    aVLTree47.insert(0);
    AVLTree.Node node52 = aVLTree47.getRoot();
    AVLTree.Node node53 = aVLTree47.getRoot();
    int i54 = aVLTree22.getBalance(node53);
    aVLTree22.insert((int)(short)10);
    AVLTree.Node node57 = aVLTree22.getRoot();
    AVLTree.Node node59 = aVLTree22.find((int)(short)1);
    aVLTree22.delete(2);
    int i62 = aVLTree22.height();
    AVLTree.Node node63 = aVLTree22.getRoot();
    int i64 = aVLTree0.getBalance(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

}

