package typings
package yuiLib.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCase
  extends ScalablyTyped.runtime.Instantiable1[/* template */ js.Object, TestCase] {
  var DEFAULT_WAIT: scala.Double = js.native
  def assert(condition: scala.Boolean, message: java.lang.String): scala.Unit = js.native
  def callback(args: js.Any*): js.Function = js.native
  def destroy(): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def resume(segment: js.Function): scala.Unit = js.native
  def setUp(): scala.Unit = js.native
  def tearDown(): scala.Unit = js.native
  def wait(segment: js.Function): scala.Unit = js.native
  def wait(segment: js.Function, delay: scala.Double): scala.Unit = js.native
  def waitFor(condition: js.Function, segment: js.Function): scala.Unit = js.native
  def waitFor(condition: js.Function, segment: js.Function, timeout: scala.Double): scala.Unit = js.native
  def waitFor(condition: js.Function, segment: js.Function, timeout: scala.Double, increment: scala.Double): scala.Unit = js.native
}

