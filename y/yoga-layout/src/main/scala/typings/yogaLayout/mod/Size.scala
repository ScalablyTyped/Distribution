package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  def fromJS(expose: js.Function2[/* width */ Double, /* height */ Double, _]): Unit = js.native
  
  val height: Double = js.native
  
  val width: Double = js.native
}
object Size {
  
  @scala.inline
  def apply(
    fromJS: js.Function2[/* width */ Double, /* height */ Double, _] => Unit,
    height: Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromJS(value: js.Function2[/* width */ Double, /* height */ Double, _] => Unit): Self = StObject.set(x, "fromJS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
