package typings.zchatBrowser.mod

import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "setVisitorInfo")
@js.native
object setVisitorInfo extends js.Object {
  def apply(options: Partial[VisitorInfo]): Unit = js.native
  def apply(options: Partial[VisitorInfo], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

