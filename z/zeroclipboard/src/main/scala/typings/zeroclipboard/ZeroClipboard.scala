package typings.zeroclipboard

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.zeroclipboard.ZC.List
import typings.zeroclipboard.ZC.ZeroClipboardClient
import typings.zeroclipboard.ZC.ZeroClipboardStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ZeroClipboard")
@js.native
class ZeroClipboard () extends ZeroClipboardClient {
  def this(elements: Element) = this()
  def this(elements: List[Element]) = this()
}

/**
  * [ZeroClipboard description]
  * @type {ZC.ZeroClipboardStatic}
  */
@JSGlobal("ZeroClipboard")
@js.native
object ZeroClipboard extends TopLevel[ZeroClipboardStatic]

