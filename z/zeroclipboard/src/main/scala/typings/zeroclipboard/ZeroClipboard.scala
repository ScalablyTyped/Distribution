package typings.zeroclipboard

import typings.std.Element
import typings.zeroclipboard.ZCNs.List
import typings.zeroclipboard.ZCNs.ZeroClipboardClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ZeroClipboard")
@js.native
class ZeroClipboard () extends ZeroClipboardClient {
  def this(elements: Element) = this()
  def this(elements: List[Element]) = this()
}

