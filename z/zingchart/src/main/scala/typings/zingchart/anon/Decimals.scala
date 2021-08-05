package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decimals extends StObject {
  
  /**
    * To set the number of decimals that will be displayed. 0 | 1 |2 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /**
    * To set the font color. 'gray' | '#666699' | ...
    */
  var `font-color`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To set the font family. 'Arial' | 'Georgia' | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  
  /**
    * To set the font size. 30 | 24 | 16 | ...
    */
  var `font-size`: js.UndefOr[Double] = js.undefined
  
  /**
    * To set the font style. 'normal' | 'italic'
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  
  /**
    * To set the font weight. 'normal' | 'bold'
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Decimals {
  
  inline def apply(): Decimals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Decimals]
  }
  
  extension [Self <: Decimals](x: Self) {
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def `setFont-color`(value: js.Any): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    inline def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: Double): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
