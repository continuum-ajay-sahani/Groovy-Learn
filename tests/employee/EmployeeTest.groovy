package tests.employee

import src.employee.*

class EmployeeTest extends GroovyTestCase {
   void testDisplay() {
      Employee mst = new Employee();
      mst.name = "Joe";
      mst.ID = 1;
      def expected = 'Joe1'
      assertToString(mst.Display(), expected)
   }

}