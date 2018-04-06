package bootstrap

import org.scalatest.{FunSpec, Matchers}

class Test extends FunSpec with Matchers {
  describe("Test case") {
    describe("Addition") {
      it("Should set add two positive integers") {
        Object.add(5, 10) should be(15)
      }

      it("Should set add two negative integers") {
        Object.add(-5, -10) should be(-15)
      }
    }
  }
}

