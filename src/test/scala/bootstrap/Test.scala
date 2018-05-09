package bootstrap

import org.scalatest.{FunSpec, Matchers}

class Test extends FunSpec with Matchers {
  describe("Test case") {
    describe("Addition") {
      it("Should set add two positive integers") {
        FpTraining.addMethod(5, 10) should be(15)
      }

      it("Should set add two negative integers") {
        FpTraining.addMethod(-5, -10) should be(-15)
      }

      describe("Sum a list") {
        it("Should return 0 Given an empty list") {
          FpTraining.sum(List.empty) should be(0)
        }

        it("Should return the of all elements Given a non empty list") {
          FpTraining.sum(List(-1,4,0)) should be(3)
        }
      }

      describe("Format") {
        it("Should return a formatted string Given an Integer") {
          FpTraining.format(10) should be("10 is formatted")
        }
      }
    }
  }
}

