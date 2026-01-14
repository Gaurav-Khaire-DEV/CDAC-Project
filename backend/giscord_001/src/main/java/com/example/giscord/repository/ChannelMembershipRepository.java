package com.example.giscord.repository;

import com.example.giscord.entity.ChannelMembership;
import com.example.giscord.entity.ChannelMembershipId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelMembershipRepository extends JpaRepository<ChannelMembership, ChannelMembershipId> {
}
