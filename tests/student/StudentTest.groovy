package tests.student

import src.student.*

class StudentTest extends GroovyTestCase {
   void testDisplay() {
      Student mst = new Student();
      mst.name = "Joe";
      mst.ID = 1;
      def expected = 'Joe ,stu_1'
      assertToString(mst.display(), expected)
   }

   void testGreet() {
      Student mst = new Student();
      mst.name = "Joe";
      def expected = 'Hello, Joe!'
      assertToString(mst.greeting(), expected)
   }
}