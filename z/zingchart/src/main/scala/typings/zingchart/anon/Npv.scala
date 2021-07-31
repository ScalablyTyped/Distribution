package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Npv extends StObject {
  
  var npv: js.UndefOr[Decimals] = js.undefined
  
  var title: js.UndefOr[Fontfamily] = js.undefined
  
  var value: js.UndefOr[Fontfamily] = js.undefined
  
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Npv {
  
  @scala.inline
  def apply(): Npv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npv]
  }
  
  @scala.inline
  implicit class NpvMutableBuilder[Self <: Npv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNpv(value: Decimals): Self = StObject.set(x, "npv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNpvUndefined: Self = StObject.set(x, "npv", js.undefined)
    
    @scala.inline
    def setTitle(value: Fontfamily): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: Fontfamily): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
