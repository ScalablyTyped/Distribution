package typings
package zeroclipboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ZeroClipboard")
@js.native
class ZeroClipboard ()
  extends zeroclipboardLib.ZCNs.ZeroClipboardClient {
  def this(elements: stdLib.Element) = this()
  def this(elements: zeroclipboardLib.ZCNs.List[stdLib.Element]) = this()
}

