package typings.yui

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Y extends Shortcut {
    
    @JSGlobal("Y")
    @js.native
    val ^ : YUI = js.native
    
    type _To = YUI
    
    /* This means you don't have to write `^`, but can instead just say `Y.foo` */
    override def _to: YUI = ^
  }
  
  @JSGlobal("YUI")
  @js.native
  def YUI: typings.yui.YUI = js.native
  @scala.inline
  def YUI_=(x: YUI): Unit = js.Dynamic.global.updateDynamic("YUI")(x.asInstanceOf[js.Any])
}
