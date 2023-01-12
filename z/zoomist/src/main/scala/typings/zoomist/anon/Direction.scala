package typings.zoomist.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: String
  
  var el: String
  
  var isCustomEl: Boolean
  
  var maxRatio: Double
  
  var mounted: Boolean
  
  var sldierBar: HTMLElement
  
  var sliderButton: HTMLElement
  
  var sliderEl: HTMLElement
  
  var sliderMain: HTMLElement
  
  var sliding: Boolean
  
  var value: Double
}
object Direction {
  
  inline def apply(
    direction: String,
    el: String,
    isCustomEl: Boolean,
    maxRatio: Double,
    mounted: Boolean,
    sldierBar: HTMLElement,
    sliderButton: HTMLElement,
    sliderEl: HTMLElement,
    sliderMain: HTMLElement,
    sliding: Boolean,
    value: Double
  ): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], isCustomEl = isCustomEl.asInstanceOf[js.Any], maxRatio = maxRatio.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], sldierBar = sldierBar.asInstanceOf[js.Any], sliderButton = sliderButton.asInstanceOf[js.Any], sliderEl = sliderEl.asInstanceOf[js.Any], sliderMain = sliderMain.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setIsCustomEl(value: Boolean): Self = StObject.set(x, "isCustomEl", value.asInstanceOf[js.Any])
    
    inline def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
    
    inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    
    inline def setSldierBar(value: HTMLElement): Self = StObject.set(x, "sldierBar", value.asInstanceOf[js.Any])
    
    inline def setSliderButton(value: HTMLElement): Self = StObject.set(x, "sliderButton", value.asInstanceOf[js.Any])
    
    inline def setSliderEl(value: HTMLElement): Self = StObject.set(x, "sliderEl", value.asInstanceOf[js.Any])
    
    inline def setSliderMain(value: HTMLElement): Self = StObject.set(x, "sliderMain", value.asInstanceOf[js.Any])
    
    inline def setSliding(value: Boolean): Self = StObject.set(x, "sliding", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
