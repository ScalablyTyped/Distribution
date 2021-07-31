package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uniform extends StObject {
  
  /**
    * The text of the scale label, can use tokens for day, hour, minute, year etc to add in such information, ONLY if "type"="date" has
    * been specified in this transform object. If values for both "text" and "all" have been specified, the value in "text" will be used
    * . 'Month of %M' | '%d' | ...
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * To convert Unix timestamps into dates. Use this attribute with the all attribute. 'date'
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * To set the time-series scale to linear (uniform) or non-linear. true | false | 1 | 0
    */
  var uniform: js.UndefOr[Boolean] = js.undefined
}
object Uniform {
  
  @scala.inline
  def apply(): Uniform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uniform]
  }
  
  @scala.inline
  implicit class UniformMutableBuilder[Self <: Uniform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniform(value: Boolean): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformUndefined: Self = StObject.set(x, "uniform", js.undefined)
  }
}
