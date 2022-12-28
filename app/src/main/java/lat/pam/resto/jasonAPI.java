package lat.pam.resto.api;

import java.util.List;

import lat.pam.resto.model.postModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface jasonAPI {
    @GET ("posts")
    Call<List<postModel>> getPosts();
}
