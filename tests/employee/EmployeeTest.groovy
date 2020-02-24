package tests.employee

import src.employee.*

class EmployeeTest extends GroovyTestCase {
   void testDisplay() {
      Employee mst = new Employee();
      mst.name = "Joe";
      mst.ID = 1;
      def expected = 'Joe ,emp_1'
      assertToString(mst.display(), expected)
   }

   void testGreet() {
      Employee mst = new Employee();
      mst.name = "Joe";
      def expected = 'Hello, Joe!'
      assertToString(mst.greeting(), expected)
   }

}