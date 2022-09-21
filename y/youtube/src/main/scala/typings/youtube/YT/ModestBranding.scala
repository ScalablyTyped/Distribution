package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModestBranding extends StObject
@JSGlobal("YT.ModestBranding")
@js.native
object ModestBranding extends StObject {
  
  /**
    * Player will contain full YouTube branding.
    */
  @js.native
  sealed trait Full
    extends StObject
       with ModestBranding
  
  /**
    * YouTube logo will not display in the control bar.
    */
  @js.native
  sealed trait Modest
    extends StObject
       with ModestBranding
}
