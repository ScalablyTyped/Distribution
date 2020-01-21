package typings.zchatBrowser.mod

import typings.std.File
import typings.zchatBrowser.AnonMimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "sendFile")
@js.native
object sendFile extends js.Object {
  def apply(file: File): Unit = js.native
  def apply(file: File, callback: js.Function2[/* err */ SendFileErrorMessage, /* data */ AnonMimetype, Unit]): Unit = js.native
}

