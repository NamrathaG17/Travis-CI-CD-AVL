/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 04:28:38 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals((-1), aVLTree0.height());
      assertNull(aVLTree_Node0);
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals((-1), aVLTree0.height());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete((-1332));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-1332));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-1332));
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node2);
      assertSame(aVLTree_Node2, aVLTree_Node1);
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node0));
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node3);
      assertNotSame(aVLTree_Node3, aVLTree_Node0);
      assertSame(aVLTree_Node3, aVLTree_Node2);
      assertSame(aVLTree_Node3, aVLTree_Node1);
      
      AVLTree.Node aVLTree_Node4 = aVLTree0.find((-1332));
      assertEquals(0, aVLTree0.height());
      assertNull(aVLTree_Node4);
      
      aVLTree_Node0.right = aVLTree_Node3;
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int0);
      
      int int1 = aVLTree0.getBalance(aVLTree_Node0);
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node3));
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node2));
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node1));
      assertFalse(int1 == int0);
      assertEquals(0, aVLTree0.height());
      assertEquals(1, int1);
      assertNotSame(aVLTree_Node0, aVLTree_Node3);
      assertNotSame(aVLTree_Node0, aVLTree_Node2);
      assertNotSame(aVLTree_Node0, aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(1);
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      int int1 = aVLTree0.getBalance(aVLTree_Node0);
      assertTrue(int1 == int0);
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(416);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertEquals((-1), aVLTree0.height());
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete((-1));
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals((-1), aVLTree0.height());
      assertEquals((-1), int0);
      
      aVLTree0.insert((-1));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-1972));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(969);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(628);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(534);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(628);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete((-1972));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      int int1 = aVLTree0.height();
      assertFalse(int1 == int0);
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int1);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree0.insert(1);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node2);
      assertSame(aVLTree_Node2, aVLTree_Node1);
      assertSame(aVLTree_Node2, aVLTree_Node0);
      
      aVLTree0.delete(534);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1972));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node3);
      assertSame(aVLTree_Node3, aVLTree_Node1);
      assertSame(aVLTree_Node3, aVLTree_Node2);
      assertSame(aVLTree_Node3, aVLTree_Node0);
      
      int int2 = aVLTree0.height();
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int2);
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = 1992;
      aVLTree0.delete(1992);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree_Node0.height = 0;
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.left = aVLTree_Node1;
      assertEquals(0, aVLTree0.height());
      
      int int1 = 0;
      aVLTree_Node1.height = 1887;
      assertEquals(1887, aVLTree0.height());
      
      aVLTree_Node1.height = 1992;
      assertEquals(1992, aVLTree0.height());
      
      aVLTree_Node1.key = 0;
      assertEquals(1992, aVLTree0.height());
      
      int int2 = aVLTree0.getBalance(aVLTree_Node0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(1992, aVLTree0.height());
      assertEquals((-1993), int2);
      assertSame(aVLTree_Node0, aVLTree_Node1);
      
      aVLTree_Node0.right = aVLTree_Node1;
      assertEquals(1992, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertEquals(1992, aVLTree0.height());
      assertNotNull(aVLTree_Node2);
      assertSame(aVLTree_Node2, aVLTree_Node0);
      assertSame(aVLTree_Node2, aVLTree_Node1);
      
      aVLTree_Node1.right = aVLTree_Node2;
      assertEquals(1992, aVLTree0.height());
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(1992, aVLTree0.height());
      
      int int3 = aVLTree0.height();
      assertFalse(int3 == int1);
      assertTrue(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals(1992, aVLTree0.height());
      assertEquals(1992, int3);
      
      // Undeclared exception!
      aVLTree0.find((-1993));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = aVLTree0.height();
      assertEquals((-1), aVLTree0.height());
      assertEquals((-1), int0);
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(1);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1188));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(3141);
      assertEquals(1, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert((-24));
      assertEquals(0, aVLTree0.height());
      
      int int0 = (-1937);
      aVLTree0.delete((-1937));
      assertEquals(0, aVLTree0.height());
      
      int int1 = 0;
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1826));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.left = aVLTree_Node1;
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(1, aVLTree0.height());
      
      int int2 = 0;
      // Undeclared exception!
      try { 
        aVLTree0.insert(int2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(3343);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1707));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      int int1 = aVLTree0.height();
      assertTrue(int1 == int0);
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int1);
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-2850));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete((-1536));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertEquals(1, aVLTree0.height());
      assertNull(aVLTree_Node0);
      
      int int2 = aVLTree0.height();
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int2);
      
      int int3 = aVLTree0.height();
      assertTrue(int3 == int1);
      assertTrue(int3 == int2);
      assertTrue(int3 == int0);
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int3);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      
      aVLTree_Node1.left = null;
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-1628));
      assertEquals(1, aVLTree0.height());
      assertNull(aVLTree_Node2);
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      int int4 = aVLTree0.getBalance(aVLTree_Node1);
      assertFalse(int4 == int3);
      assertFalse(int4 == int1);
      assertFalse(int4 == int2);
      assertFalse(int4 == int0);
      assertEquals(1, aVLTree0.height());
      assertEquals(0, int4);
      
      aVLTree_Node1.height = (-1519);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.find(1561);
      assertEquals(1, aVLTree0.height());
      assertNull(aVLTree_Node3);
      
      int int5 = aVLTree0.getBalance((AVLTree.Node) null);
      assertFalse(int5 == int3);
      assertFalse(int5 == int0);
      assertFalse(int5 == int2);
      assertTrue(int5 == int4);
      assertFalse(int5 == int1);
      assertEquals(1, aVLTree0.height());
      assertEquals(0, int5);
      
      // Undeclared exception!
      try { 
        aVLTree0.delete(1862);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = (-1304);
      aVLTree0.insert((-1304));
      assertEquals(0, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1304));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-4383));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node1));
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node2);
      assertNotSame(aVLTree_Node2, aVLTree_Node1);
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(1);
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      int int1 = aVLTree0.getBalance(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node2));
      assertFalse(int1 == int0);
      assertEquals(1, aVLTree0.height());
      assertEquals(0, int1);
      assertNotSame(aVLTree_Node1, aVLTree_Node2);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node2));
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node3);
      assertSame(aVLTree_Node3, aVLTree_Node0);
      assertNotSame(aVLTree_Node3, aVLTree_Node2);
      assertSame(aVLTree_Node3, aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(1300);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(1255);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-39));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(364);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1296);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-972));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-2120));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      assertEquals(2, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertEquals(2, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree0.delete((-972));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = (-967);
      aVLTree0.insert((-967));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-2120));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-967));
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      // Undeclared exception!
      try { 
        aVLTree0.delete((-967));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(1047);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int0);
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete(1);
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-437));
      assertEquals(0, aVLTree0.height());
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(1181);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(1);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1181);
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.insert(1485);
      int int0 = (-46);
      int int1 = 0;
      aVLTree0.insert(5505);
      aVLTree0.insert((-46));
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(5505);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert((-972));
      aVLTree0.insert((-2118));
      aVLTree0.insert((-1));
      aVLTree0.find((-1));
      aVLTree0.getRoot();
      aVLTree0.delete((-972));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find((-1821));
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
  }
}