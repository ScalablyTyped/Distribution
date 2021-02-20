package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait STATUS extends StObject
@JSGlobal("STATUS")
@js.native
object STATUS extends StObject {
  
  @js.native
  sealed trait DONE extends STATUS
  
  @js.native
  sealed trait FAILED extends STATUS
  
  @js.native
  sealed trait QUEUED extends STATUS
  
  @js.native
  sealed trait STARTED extends STATUS
  
  @js.native
  sealed trait STOPPED extends STATUS
  
  @js.native
  sealed trait UPLOADING extends STATUS
}
