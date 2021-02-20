package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Cylinder")
@js.native
class Cylinder () extends Shape {
  def this(options: CylinderOptions) = this()
  
  /** @see {@link CylinderOptions#diameter} */
  var diameter: Double = js.native
  
  /** @see {@link CylinderOptions#frontFace} */
  var frontFace: js.UndefOr[Boolean | String] = js.native
  
  /** @see {@link CylinderOptions#length} */
  var length: Double = js.native
}
