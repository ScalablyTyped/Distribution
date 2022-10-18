package typings.yuka

import typings.yuka.srcNavigationNavmeshNavMeshMod.NavMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNavigationNavmeshNavMeshLoaderMod {
  
  @JSImport("yuka/src/navigation/navmesh/NavMeshLoader", "NavMeshLoader")
  @js.native
  open class NavMeshLoader () extends StObject {
    
    /**
      * Loads a {@link NavMesh navigation mesh} from the given URL. The second parameter can be used
      * to influence the parsing of the navigation mesh.
      *
      * @param url - The URL of the glTF asset.
      * @param [options] - The (optional) configuration object.
      * @return A promise representing the loading and parsing process.
      */
    def load(url: String): js.Promise[NavMesh] = js.native
    def load(url: String, options: NavMeshLoaderOptions): js.Promise[NavMesh] = js.native
    
    /**
      * Use this method if you are loading the contents of a navmesh not via {@link NavMeshLoader#load}.
      * This is for example useful in a node environment.
      *
      * It's mandatory to use glb files with embedded buffer data if you are going to load nav meshes
      * in node.js.
      *
      * @param arrayBuffer - The array buffer.
      * @param [url] - The (optional) URL.
      * @param [options] - The (optional) configuration object.
      * @return A promise representing the parsing process.
      */
    def parse(arrayBuffer: js.typedarray.ArrayBuffer): js.Promise[NavMesh] = js.native
    def parse(arrayBuffer: js.typedarray.ArrayBuffer, url: String): js.Promise[NavMesh] = js.native
    def parse(arrayBuffer: js.typedarray.ArrayBuffer, url: String, options: NavMeshLoaderOptions): js.Promise[NavMesh] = js.native
    def parse(arrayBuffer: js.typedarray.ArrayBuffer, url: Unit, options: NavMeshLoaderOptions): js.Promise[NavMesh] = js.native
  }
  
  trait NavMeshLoaderOptions extends StObject {
    
    /**
      * The tolerance value for the containment test.
      */
    var epsilonContainsTest: js.UndefOr[Double] = js.undefined
    
    /**
      * The tolerance value for the coplanar test.
      */
    var epsilonCoplanarTest: js.UndefOr[Double] = js.undefined
  }
  object NavMeshLoaderOptions {
    
    inline def apply(): NavMeshLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavMeshLoaderOptions]
    }
    
    extension [Self <: NavMeshLoaderOptions](x: Self) {
      
      inline def setEpsilonContainsTest(value: Double): Self = StObject.set(x, "epsilonContainsTest", value.asInstanceOf[js.Any])
      
      inline def setEpsilonContainsTestUndefined: Self = StObject.set(x, "epsilonContainsTest", js.undefined)
      
      inline def setEpsilonCoplanarTest(value: Double): Self = StObject.set(x, "epsilonCoplanarTest", value.asInstanceOf[js.Any])
      
      inline def setEpsilonCoplanarTestUndefined: Self = StObject.set(x, "epsilonCoplanarTest", js.undefined)
    }
  }
}
