package typings.zwlogBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ZwLog")
  @js.native
  open class ZwLog protected ()
    extends StObject
       with zwlog {
    def this(initOptions: ZwLogInitOptions) = this()
  }
  @JSGlobal("ZwLog")
  @js.native
  def ZwLog: ZwLog_ = js.native
  inline def ZwLog_=(x: ZwLog_): Unit = js.Dynamic.global.updateDynamic("ZwLog")(x.asInstanceOf[js.Any])
}
