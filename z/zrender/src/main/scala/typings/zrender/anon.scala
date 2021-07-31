package typings.zrender

import typings.zrender.zrender.ColorStops
import typings.zrender.zrender.GlobalCoords
import typings.zrender.zrender.X
import typings.zrender.zrender.X2
import typings.zrender.zrender.Y
import typings.zrender.zrender.Y2
import typings.zrender.zrenderStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddColorStop extends StObject {
    
    def addColorStop(offset: Double, color: String): Unit
    
    var colorStops: ColorStops
    
    var globalCoord: GlobalCoords
    
    var `type`: linear
    
    var x: X
    
    var x2: X2
    
    var y: Y
    
    var y2: Y2
  }
  object AddColorStop {
    
    @scala.inline
    def apply(
      addColorStop: (Double, String) => Unit,
      colorStops: ColorStops,
      globalCoord: GlobalCoords,
      x: X,
      x2: X2,
      y: Y,
      y2: Y2
    ): AddColorStop = {
      val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops.asInstanceOf[js.Any], globalCoord = globalCoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("linear")
      __obj.asInstanceOf[AddColorStop]
    }
    
    @scala.inline
    implicit class AddColorStopMutableBuilder[Self <: AddColorStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setColorStops(value: ColorStops): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorStopsVarargs(value: Color*): Self = StObject.set(x, "colorStops", js.Array(value :_*))
      
      @scala.inline
      def setGlobalCoord(value: GlobalCoords): Self = StObject.set(x, "globalCoord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: X): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: X2): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Y): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Y2): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var offset: Double
  }
  object Color {
    
    @scala.inline
    def apply(color: String, offset: Double): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
