package typings.yuka.srcYukaMod

import typings.yuka.srcGraphExtraPriorityQueueMod.CompareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "PriorityQueue")
@js.native
/**
  * Constructs a new priority queue.
  *
  * @param [compare] - The compare function used for sorting.
  */
open class PriorityQueue[T] ()
  extends typings.yuka.srcGraphExtraPriorityQueueMod.PriorityQueue[T] {
  def this(compare: CompareFunction[T]) = this()
}
