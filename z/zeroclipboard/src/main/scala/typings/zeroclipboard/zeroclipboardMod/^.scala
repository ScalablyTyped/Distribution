package typings.zeroclipboard.zeroclipboardMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.zeroclipboard.ZC.List
import typings.zeroclipboard.ZC.ZeroClipboardClient
import typings.zeroclipboard.ZC.ZeroClipboardStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeroclipboard", JSImport.Namespace)
@js.native
class ^ () extends ZeroClipboardClient {
  def this(elements: Element) = this()
  def this(elements: List[Element]) = this()
}

@JSImport("zeroclipboard", JSImport.Namespace)
@js.native
object ^ extends TopLevel[ZeroClipboardStatic]

