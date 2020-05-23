package typings.zeroclipboard.anon

import typings.zeroclipboard.ZC.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearData extends js.Object {
  def clearData(): Unit = js.native
  def clearData(mimeType: String): Unit = js.native
  def setData(data: Dictionary[String]): Unit = js.native
  def setData(format: String, data: String): Unit = js.native
}

