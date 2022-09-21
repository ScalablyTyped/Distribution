package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.edgeMod.Edge
import typings.yuka.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  @JSImport("yuka/src/graph/core/Graph", "Graph")
  @js.native
  /**
    * Constructs a new graph.
    */
  open class Graph[TNode /* <: Node */, TEdge /* <: Edge */] () extends StObject {
    
    /**
      * Adds an edge to the graph.
      * If the graph is undirected, the method automatically creates the opponent edge.
      *
      * @param edge - The edge to add.
      */
    def addEdge(edge: TEdge): this.type = js.native
    
    /**
      * Adds a node to the graph.
      *
      * @param node - The node to add.
      */
    def addNode(node: TNode): this.type = js.native
    
    /**
      * Removes all nodes and edges from this graph.
      */
    def clear(): this.type = js.native
    
    /**
      * Whether this graph is directed or not.
      * @default false
      */
    var digraph: Boolean = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Returns an edge for the given *from* and *to* node indices.
      * If no node is found, *null* is returned.
      *
      * @param from - The index of the from node.
      * @param to - The index of the to node.
      */
    def getEdge(from: Double, to: Double): this.type = js.native
    
    /**
      * Returns the edge count of the graph.
      */
    def getEdgeCount(): Double = js.native
    
    /**
      * Gathers all edges leading from the given node index and stores them
      * into the given array.
      *
      * @param index - The node index.
      * @param result - The result array.
      */
    def getEdgesOfNode(index: Double, result: js.Array[TEdge]): js.Array[TEdge] = js.native
    
    /**
      * Returns a node for the given node index.
      * If no node is found, *null* is returned.
      *
      * @param index - The index of the node.
      */
    def getNode(index: Double): TNode = js.native
    
    /**
      * Returns the node count of the graph.
      */
    def getNodeCount(): Double = js.native
    
    /**
      * Gathers all nodes of the graph and stores them into the given array.
      *
      * @param result - The result array.
      */
    def getNodes(result: js.Array[TNode]): js.Array[TNode] = js.native
    
    /**
      * Return true if the graph has an edge connecting the given
      * *from* and *to* node indices.
      *
      * @param from - The index of the from node.
      * @param to - The index of the to node.
      */
    def hasEdge(from: Double, to: Double): Boolean = js.native
    
    /**
      * Return true if the graph has the given node index.
      *
      * @param index - The node index to test.
      */
    def hasNode(index: Double): Boolean = js.native
    
    /**
      * Removes the given edge from the graph. If the graph is undirected, the
      * method also removes the opponent edge.
      *
      * @param edge - The edge to remove.
      */
    def removeEdge(edge: TEdge): this.type = js.native
    
    /**
      * Removes the given node from the graph and all edges which are connected
      * with this node.
      *
      * @param node - The node to remove.
      */
    def removeNode(node: TNode): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
