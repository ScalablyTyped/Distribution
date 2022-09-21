package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClosedCaptionsLoadPolicy extends StObject
@JSGlobal("YT.ClosedCaptionsLoadPolicy")
@js.native
object ClosedCaptionsLoadPolicy extends StObject {
  
  /**
    * For closed captions to be shown.
    */
  @js.native
  sealed trait ForceOn
    extends StObject
       with ClosedCaptionsLoadPolicy
  
  /**
    * Defaults to the user's preferences.
    */
  @js.native
  sealed trait UserDefault
    extends StObject
       with ClosedCaptionsLoadPolicy
}
