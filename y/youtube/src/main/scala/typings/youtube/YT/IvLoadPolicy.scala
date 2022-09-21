package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IvLoadPolicy extends StObject
@JSGlobal("YT.IvLoadPolicy")
@js.native
object IvLoadPolicy extends StObject {
  
  /**
    * Video annotations will not be shown.
    */
  @js.native
  sealed trait Hide
    extends StObject
       with IvLoadPolicy
  
  /**
    * Video annotations will be shown.
    */
  @js.native
  sealed trait Show
    extends StObject
       with IvLoadPolicy
}
