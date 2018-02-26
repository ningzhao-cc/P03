import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Ning on 2/23/18.
 */
public class DiscoverTest {
    public static void main(String[] args) {

        String version = "v1";
        String product = "JPIVI";

        String provider = "deezer,amazon"; // provider can be null, can contains invalid provider
        List<String> finalProvider = validProvider(provider);

        String mediaType = "playlists,tracks";
        List<String> finalMediaType = validMediaType(mediaType);


        Document pipeline = new Document("config", getConfig(version, product)).append("provider", finalProvider)
                .append("mediaType", finalMediaType);

        Document result = getDiscover(pipeline);


    }


    /**
     *
     * @param pipeline
     * @return
     *
     * 1. for different mediaTypes, each provider has different API
     * 2. * based on provider list, go through each provider to get available list of results
     *          * this will need group later for mixing a mediaType results from different providers.
     * 3. * based on mediaType, go through each mediaType, then go to available provider
     */
    public static Document getDiscover(Document pipeline) {

        Document config = (Document) pipeline.get("config");
        List<String> providers = (List<String>)pipeline.get("provider");
        List<String> mediaTypes = (List<String>)pipeline.get("mediaType");





        return new Document();
    }


    public static List<String> validProvider(String provider) {
        final List<String> applicableProviders = asList("deezer", "spotify", "amazon", "tunein");

        if (provider == null || provider.isEmpty()) {
            return applicableProviders;
        }

        String[] strs = provider.split(",");

        List<String> providers = new ArrayList<>();

        for (String p : strs) {
            if (applicableProviders.contains(p)) {
                providers.add(p);
            }
        }

        providers = providers.size() == 0 ? applicableProviders : providers;

        return providers;
    }

    public static List<String> validMediaType(String mediaType) {
        final List<String> applicableMediaTypes = asList("ablums", "artists");

        if (mediaType == null || mediaType.isEmpty()) {
            return applicableMediaTypes;
        }

        String[] strs = mediaType.split(",");

        List<String> mediaTypes = new ArrayList<>();

        for (String p : strs) {
            if (applicableMediaTypes.contains(p)) {
                mediaTypes.add(p);
            }
        }

        mediaTypes = mediaTypes.size() == 0 ? applicableMediaTypes : mediaTypes;

        return mediaTypes;
    }


    public static List<Document> getConfig(String version, String product) {
        String str = version + "_" + product;

        switch (str) {
            case "v1_JPIVI":
                return getV1JPIVIConfig();
            default:
                return null;
        }
    }

    public static List<Document> getV1JPIVIConfig() {
        Document music = new Document("parent", "music").append("child", asList("playlists", "tracks", "albums"));
        Document radio = new Document("parent", "news").append("child", asList("sports", "finance"));

        return asList(music, radio);
    }


    public static Document getDiscoverFromAmazon() {
        Document res = new Document();
        return res;
    }
}
