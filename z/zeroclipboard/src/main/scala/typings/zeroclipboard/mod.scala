package typings.zeroclipboard

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import typings.zeroclipboard.ZC.List
import typings.zeroclipboard.ZC.ZeroClipboardClient
import typings.zeroclipboard.ZC.ZeroClipboardStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AMD and CommonJS module `zeroclipboard`
  * @module
  */
object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("zeroclipboard", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ZeroClipboardClient {
    def this(elements: Element) = this()
    def this(elements: List[Element]) = this()
  }
  @JSImport("zeroclipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ZeroClipboardStatic = js.native
  
  type _To = js.Object & ZeroClipboardStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ZeroClipboardStatic = ^
}
