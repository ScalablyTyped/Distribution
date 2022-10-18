package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "Edge")
@js.native
/**
  * Constructs a new edge.
  *
  * @param [from=-1] - The index of the from node.
  * @param [to=-1] - The index of the to node.
  * @param [cost=0] - The cost of this edge.
  */
open class Edge ()
  extends typings.yuka.srcYukaMod.Edge {
  def this(from: Double) = this()
  def this(from: Double, to: Double) = this()
  def this(from: Unit, to: Double) = this()
  def this(from: Double, to: Double, cost: Double) = this()
  def this(from: Double, to: Unit, cost: Double) = this()
  def this(from: Unit, to: Double, cost: Double) = this()
  def this(from: Unit, to: Unit, cost: Double) = this()
}
