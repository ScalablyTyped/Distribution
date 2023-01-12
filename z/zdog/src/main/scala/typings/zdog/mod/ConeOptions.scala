package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConeOptions
  extends StObject
     with EllipseOptions {
  
  /** @default 1 */
  val length: js.UndefOr[Double] = js.undefined
}
object ConeOptions {
  
  inline def apply(): ConeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConeOptions] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
