package typings.yup.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonExclusiveAssertingTestOptions[U, P /* <: Record[String, _] */]
  extends NonExclusiveTestOptions[P]
     with AssertingTestOptions[U, P] {
  @JSName("test")
  var test_Original_NonExclusiveAssertingTestOptions: AssertingTestFunction[U] = js.native
}

