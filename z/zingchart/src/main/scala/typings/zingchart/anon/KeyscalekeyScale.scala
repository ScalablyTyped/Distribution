package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyscalekeyScale extends StObject {
  
  /**
    * Sets the key-scale value "scale-k" | "scale-v" | ...
    */
  var `key-scalekeyScale`: js.UndefOr[String] = js.native
  
  /**
    * Sets the value-scale value "scale-x" | "scale-y" | ...
    */
  var `val-scalevalScale`: js.UndefOr[String] = js.native
}
object KeyscalekeyScale {
  
  @scala.inline
  def apply(): KeyscalekeyScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyscalekeyScale]
  }
  
  @scala.inline
  implicit class KeyscalekeyScaleMutableBuilder[Self <: KeyscalekeyScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setKey-scalekeyScale`(value: String): Self = StObject.set(x, "key-scalekeyScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setKey-scalekeyScaleUndefined`: Self = StObject.set(x, "key-scalekeyScale", js.undefined)
    
    @scala.inline
    def `setVal-scalevalScale`(value: String): Self = StObject.set(x, "val-scalevalScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVal-scalevalScaleUndefined`: Self = StObject.set(x, "val-scalevalScale", js.undefined)
  }
}
