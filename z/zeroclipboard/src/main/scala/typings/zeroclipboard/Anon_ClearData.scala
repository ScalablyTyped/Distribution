package typings.zeroclipboard

import typings.zeroclipboard.ZCNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClearData extends js.Object {
  def clearData(): Unit = js.native
  def clearData(mimeType: String): Unit = js.native
  def setData(data: Dictionary[String]): Unit = js.native
  def setData(format: String, data: String): Unit = js.native
}

