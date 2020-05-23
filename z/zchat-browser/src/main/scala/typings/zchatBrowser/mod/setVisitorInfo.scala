package typings.zchatBrowser.mod

import typings.std.Error
import typings.zchatBrowser.anon.PartialVisitorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "setVisitorInfo")
@js.native
object setVisitorInfo extends js.Object {
  def apply(options: PartialVisitorInfo): Unit = js.native
  def apply(options: PartialVisitorInfo, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

