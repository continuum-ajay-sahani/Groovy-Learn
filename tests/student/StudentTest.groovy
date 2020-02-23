package tests.student

import src.student.*

class StudentTest extends GroovyTestCase {
   void testDisplay() {
      Student mst = new Student();
      mst.name = "Joe";
      mst.ID = 1;
      def expected = 'Joe1'
      assertToString(mst.Display(), expected)
   }
}