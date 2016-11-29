package scala.meta.serialiser

import org.scalatest._

object TestEntities {
  @mappable case class SimpleCaseClass(i: Int, s: String)
}

class MappableTest extends WordSpec with Matchers {
  import TestEntities._

  "simple case class" should {
    "deserialise to map" in {
      val testInstance = SimpleCaseClass(i = 42, s = "something")
      testInstance.toMap shouldBe 'empty
    }
  }

}
