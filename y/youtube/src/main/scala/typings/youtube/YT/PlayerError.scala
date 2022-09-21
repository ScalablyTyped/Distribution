package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayerError extends StObject
@JSGlobal("YT.PlayerError")
@js.native
object PlayerError extends StObject {
  
  /**
    * The owner of the requested video does not allow it to be played in embedded players.
    */
  @js.native
  sealed trait EmbeddingNotAllowed
    extends StObject
       with PlayerError
  
  /**
    * This error is the same as 101. It's just a 101 error in disguise!
    */
  @js.native
  sealed trait EmbeddingNotAllowed2
    extends StObject
       with PlayerError
  
  /**
    * The requested content cannot be played in an HTML5 player.
    */
  @js.native
  sealed trait Html5Error
    extends StObject
       with PlayerError
  
  /**
    * The request contained an invalid parameter value.
    */
  @js.native
  sealed trait InvalidParam
    extends StObject
       with PlayerError
  
  /**
    * The video requested was not found.
    */
  @js.native
  sealed trait VideoNotFound
    extends StObject
       with PlayerError
}
