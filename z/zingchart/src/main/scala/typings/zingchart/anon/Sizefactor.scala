package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sizefactor extends StObject {
  
  /**
    * To modify the size of the chart. Provide a value in relation to 1.0 or 100%. 0.3 | 0.9 | "30%" | "90%" | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.native
}
object Sizefactor {
  
  @scala.inline
  def apply(): Sizefactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sizefactor]
  }
  
  @scala.inline
  implicit class SizefactorMutableBuilder[Self <: Sizefactor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setSize-factor`(value: Double): Self = StObject.set(x, "size-factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSize-factorUndefined`: Self = StObject.set(x, "size-factor", js.undefined)
  }
}
