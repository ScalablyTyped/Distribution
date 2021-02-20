package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jitter extends StObject {
  
  /**
    * To set the jitter width. 0 | .5 | 1 | 2 | ...
    */
  var jitter: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the `mean-factor` width. 0 | .5 | 1 | 2 | ...
    */
  var meanFactor: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the `rounding-factor` on median edges. 0 | .5 | 1 | 2 | ...
    */
  var roundingFactor: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the styling of the violin object. {}
    */
  var style: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the trim. true | false | 0 | 1
    */
  var trim: js.UndefOr[Boolean] = js.native
}
object Jitter {
  
  @scala.inline
  def apply(): Jitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jitter]
  }
  
  @scala.inline
  implicit class JitterMutableBuilder[Self <: Jitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJitter(value: js.Any): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    @scala.inline
    def setMeanFactor(value: js.Any): Self = StObject.set(x, "meanFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanFactorUndefined: Self = StObject.set(x, "meanFactor", js.undefined)
    
    @scala.inline
    def setRoundingFactor(value: js.Any): Self = StObject.set(x, "roundingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingFactorUndefined: Self = StObject.set(x, "roundingFactor", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
