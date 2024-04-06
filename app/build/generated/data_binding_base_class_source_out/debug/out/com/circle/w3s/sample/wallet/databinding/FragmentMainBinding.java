// Generated by view binder compiler. Do not edit!
package com.circle.w3s.sample.wallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.circle.w3s.sample.wallet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LayoutInputFieldBinding addId;

  @NonNull
  public final LayoutInputFieldBinding challengeId;

  @NonNull
  public final LayoutInputFieldBinding encryptionKey;

  @NonNull
  public final LayoutInputFieldBinding endpoint;

  @NonNull
  public final TextView execute;

  @NonNull
  public final LinearLayoutCompat ll;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ScrollView scrollview;

  @NonNull
  public final TextView title;

  @NonNull
  public final LayoutInputFieldBinding userToken;

  @NonNull
  public final TextView version;

  private FragmentMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull LayoutInputFieldBinding addId, @NonNull LayoutInputFieldBinding challengeId,
      @NonNull LayoutInputFieldBinding encryptionKey, @NonNull LayoutInputFieldBinding endpoint,
      @NonNull TextView execute, @NonNull LinearLayoutCompat ll, @NonNull ProgressBar loading,
      @NonNull ConstraintLayout main, @NonNull ScrollView scrollview, @NonNull TextView title,
      @NonNull LayoutInputFieldBinding userToken, @NonNull TextView version) {
    this.rootView = rootView;
    this.addId = addId;
    this.challengeId = challengeId;
    this.encryptionKey = encryptionKey;
    this.endpoint = endpoint;
    this.execute = execute;
    this.ll = ll;
    this.loading = loading;
    this.main = main;
    this.scrollview = scrollview;
    this.title = title;
    this.userToken = userToken;
    this.version = version;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addId;
      View addId = ViewBindings.findChildViewById(rootView, id);
      if (addId == null) {
        break missingId;
      }
      LayoutInputFieldBinding binding_addId = LayoutInputFieldBinding.bind(addId);

      id = R.id.challengeId;
      View challengeId = ViewBindings.findChildViewById(rootView, id);
      if (challengeId == null) {
        break missingId;
      }
      LayoutInputFieldBinding binding_challengeId = LayoutInputFieldBinding.bind(challengeId);

      id = R.id.encryptionKey;
      View encryptionKey = ViewBindings.findChildViewById(rootView, id);
      if (encryptionKey == null) {
        break missingId;
      }
      LayoutInputFieldBinding binding_encryptionKey = LayoutInputFieldBinding.bind(encryptionKey);

      id = R.id.endpoint;
      View endpoint = ViewBindings.findChildViewById(rootView, id);
      if (endpoint == null) {
        break missingId;
      }
      LayoutInputFieldBinding binding_endpoint = LayoutInputFieldBinding.bind(endpoint);

      id = R.id.execute;
      TextView execute = ViewBindings.findChildViewById(rootView, id);
      if (execute == null) {
        break missingId;
      }

      id = R.id.ll;
      LinearLayoutCompat ll = ViewBindings.findChildViewById(rootView, id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.loading;
      ProgressBar loading = ViewBindings.findChildViewById(rootView, id);
      if (loading == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.scrollview;
      ScrollView scrollview = ViewBindings.findChildViewById(rootView, id);
      if (scrollview == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.userToken;
      View userToken = ViewBindings.findChildViewById(rootView, id);
      if (userToken == null) {
        break missingId;
      }
      LayoutInputFieldBinding binding_userToken = LayoutInputFieldBinding.bind(userToken);

      id = R.id.version;
      TextView version = ViewBindings.findChildViewById(rootView, id);
      if (version == null) {
        break missingId;
      }

      return new FragmentMainBinding((ConstraintLayout) rootView, binding_addId,
          binding_challengeId, binding_encryptionKey, binding_endpoint, execute, ll, loading, main,
          scrollview, title, binding_userToken, version);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}