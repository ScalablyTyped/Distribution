package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  val bottom: Double
  
  def fromJs(
    expose: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      js.Any
    ]
  ): Unit
  
  val height: Double
  
  val left: Double
  
  val right: Double
  
  val top: Double
  
  val width: Double
}
object Layout {
  
  inline def apply(
    bottom: Double,
    fromJs: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      js.Any
    ] => Unit,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): Layout = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fromJs = js.Any.fromFunction1(fromJs), height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setFromJs(
      value: js.Function6[
          /* left */ Double, 
          /* right */ Double, 
          /* top */ Double, 
          /* bottom */ Double, 
          /* width */ Double, 
          /* height */ Double, 
          js.Any
        ] => Unit
    ): Self = StObject.set(x, "fromJs", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
