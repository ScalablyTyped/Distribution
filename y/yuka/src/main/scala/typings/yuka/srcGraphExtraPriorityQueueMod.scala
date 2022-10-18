package typings.yuka

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGraphExtraPriorityQueueMod {
  
  @JSImport("yuka/src/graph/extra/PriorityQueue", "PriorityQueue")
  @js.native
  /**
    * Constructs a new priority queue.
    *
    * @param [compare] - The compare function used for sorting.
    */
  open class PriorityQueue[T] () extends StObject {
    def this(compare: CompareFunction[T]) = this()
    
    /**
      * The compare function used for sorting.
      */
    def compare(a: T, b: T): Double = js.native
    /**
      * The compare function used for sorting.
      */
    @JSName("compare")
    var compare_Original: CompareFunction[T] = js.native
    
    /**
      * The data items of the priority queue.
      */
    var data: js.Array[T] = js.native
    
    /**
      * The length of the priority queue.
      * @default 0
      */
    var length: Double = js.native
    
    /**
      * Returns the item with the highest priority without removal.
      *
      * @return The item with the highest priority.
      */
    def peek(): T | Null = js.native
    
    /**
      * Returns the item with the highest priority and removes
      * it from the priority queue.
      *
      * @return The item with the highest priority.
      */
    def pop(): T | Null = js.native
    
    /**
      * Pushes an item to the priority queue.
      *
      * @param item - The item to add.
      */
    def push(item: T): Unit = js.native
  }
  
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
