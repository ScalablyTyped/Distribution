package typings.zoomist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slider extends StObject {
  
  var slider: Direction
  
  var zoomer: DisableOnBounds
}
object Slider {
  
  inline def apply(slider: Direction, zoomer: DisableOnBounds): Slider = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], zoomer = zoomer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    inline def setSlider(value: Direction): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setZoomer(value: DisableOnBounds): Self = StObject.set(x, "zoomer", value.asInstanceOf[js.Any])
  }
}
