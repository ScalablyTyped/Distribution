package typings.yui.YUITest

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCase
  extends Instantiable1[/* template */ js.Object, TestCase] {
  var DEFAULT_WAIT: Double = js.native
  def assert(condition: Boolean, message: String): Unit = js.native
  def callback(args: js.Any*): js.Function = js.native
  def destroy(): Unit = js.native
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def init(): Unit = js.native
  def resume(): Unit = js.native
  def resume(segment: js.Function): Unit = js.native
  def setUp(): Unit = js.native
  def tearDown(): Unit = js.native
  def wait(segment: js.Function): Unit = js.native
  def wait(segment: js.Function, delay: Double): Unit = js.native
  def waitFor(condition: js.Function, segment: js.Function): Unit = js.native
  def waitFor(condition: js.Function, segment: js.Function, timeout: Double): Unit = js.native
  def waitFor(condition: js.Function, segment: js.Function, timeout: Double, increment: Double): Unit = js.native
}

