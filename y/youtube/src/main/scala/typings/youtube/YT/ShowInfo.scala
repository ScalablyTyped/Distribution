package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShowInfo extends StObject
@JSGlobal("YT.ShowInfo")
@js.native
object ShowInfo extends StObject {
  
  /**
    * Hide video title and uploader before video starts playing.
    */
  @js.native
  sealed trait Hide
    extends StObject
       with ShowInfo
  
  /**
    * Show video title and uploader before video starts playing.
    */
  @js.native
  sealed trait Show
    extends StObject
       with ShowInfo
}
